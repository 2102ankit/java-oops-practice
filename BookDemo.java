package exp2;
import java.util.*;

public class BookDemo {
    public static void main(String [] args){

        BookDemo bd = new BookDemo();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of Books:");
        int num = scan.nextInt();
        Book [] b = new Book[num];

        bd.input(num, b);

        int x=1;
        while( x!=0){
            System.out.println("\nWhat do you want to do?\n1.Print details of Book.\n2.Sort the Books as per price.\n0.Exit.");
            x = scan.nextInt();
            switch (x){
                case 0 ->System.out.println("Thank You!");
                case 1 -> bd.output(num,b);
                case 2 -> bd.sort(num,b);
                default -> System.out.println("Enter again");
            }
        }
    }

    void input(int number, Book[] b){
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<number ; i++)
        {
            b[i] = new Book();
            System.out.print("\nEnter title for book "+(i+1)+": ");
            b[i].title = sc.nextLine();

            System.out.print("Enter author for book "+(i+1)+": ");
            b[i].author = sc.nextLine();

            System.out.print("Enter price for book "+(i+1)+": ");
            b[i].price = sc.nextFloat();
            sc.nextLine();
        }
    }

    void output(int number, Book[] b){
        for(int i=0; i<number; i++)
        {
            System.out.println("\nBook title : "
                    +b[i].title+"\nAuthor's name: "
                    +b[i].author+"\nPrice: $"
                    +b[i].price);
        }
    }

    void sort(int number, Book[] b){
        for (int i = 0; i < number-1; i++) {
            int minInd = i;
            for (int j = i+1; j <number ; j++) {
                if (b[j].price < b[minInd].price)
                    minInd = j;
            }
            Book tempB = b[i];
            b[i] = b[minInd];
            b[minInd] = tempB;
        }
        System.out.println("Books are now Sorted!");
    }

}