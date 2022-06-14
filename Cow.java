package exp1;

import java.util.Scanner;
/*
public class Cow {
    public static void main(String[] args) {
        String[] name = new String[5];
        int[] id = new int[5];
        int[] dob = new int[5];
        int[] doc = new int[5];
        double[] milk = new double[5];

        Cow c = new Cow();
        c.input(name,id,dob,doc,milk);
        double totalMilk = c.totmilk(milk);
        double average = c.avg(totalMilk);
        int x = c.output(totalMilk,average);
        if (x==1) {
            totalMilk = 0.0;
            System.out.println("Total milk has been reset to 0.");
        }
    }// end main method

        public void input(String[] name,int[] id, int[] dob, int[] doc, double[] milk){
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter "+(i+1)+ " Cow's name:");
                name[i] = scanner.nextLine();
                System.out.println("Enter "+(i+1)+ " Cow's ID:");
                id[i] = scanner.nextInt();
                System.out.println("Enter "+(i+1)+ " Cow's D.O.B:");
                dob[i]= scanner.nextInt();
                System.out.println("Enter "+(i+1)+ " Cow's D.O. Calving:");
                doc[i]= scanner.nextInt();
                System.out.println("Enter "+(i+1)+ " Cow's milking:");
                milk[i]= scanner.nextDouble();
                scanner.nextLine();
            }// end for loop
        }// end method input

        public double totmilk(double[] milk){
            double x=0;
            for (int i = 0; i < 5; i++) {
                x+=milk[i];
            }
            return x;
        }// end method double

        public double avg(double totmilk){
            double x=totmilk/5.0;
            return x;
        }// end method avg

        public int output(double totalMilk, double average){
            System.out.println("The total milk produced is "+totalMilk);
            System.out.println("The average milk produced is "+average);
            System.out.println("Do you want to reset Total milk produced?\nPress 1 to reset or anyother key to continue.");
            Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            return r ;
        }// end method output
}// end class

*/

/*Create a class Cow, representing a cow in a dairy herd.
The class should include a name, an ID number, a date of birth,
and a date of most recent calving. Also write a method
that adds the ability to keep a total of milk output,
to enter a value for a milking, and to compute average
milk production. The method should also support the ability
to reset the total milk output value to zero. Create appropriate
 objects and use setter methods to initialise the objects and
  getter methods to extract the values of these objects.
*/

public class Cow {
    String name;
    int id;
    int dob;
    int doc;
    double milk;
    static double total;
    static double average;

    public static void main(String[] args) {
        Cow c1 = new Cow();
        c1.input(1);
        Cow c2 = new Cow();
        c2.input(2);
        Cow c3 = new Cow();
        c3.input(3);
        Cow c4 = new Cow();
        c4.input(4);
        Cow c5 = new Cow();
        c5.input(5);

        total = total(c1.milk,c2.milk,c3.milk, c4.milk, c5.milk);
        System.out.println("Total Milk Produced is " + total);
        average = average(total);
        System.out.println("Average milk produced is "+average);

    }// end main

    public void input(int x) {
        String s;
        int i;
        double d;
        Scanner scan = new Scanner(System.in);
        //scan.nextLine();
        System.out.println("Enter " + x + " Cow's name:");
        s = scan.nextLine();
        this.name = s;

        System.out.println("Enter " + x + " Cow's ID:");
        i = scan.nextInt();
        this.id = i;

        System.out.println("Enter " + x + " Cow's D.O.B:");
        i = scan.nextInt();
        this.dob = i;

        System.out.println("Enter " + x + " Cow's D.O.Calving:");
        i = scan.nextInt();
        this.doc = i;

        System.out.println("Enter " + x + " Cow's milking :");
        d = scan.nextDouble();
        this.milk = d;

        scan = new Scanner(System.in);

    }// end input

    public static double total(double m1, double m2, double m3, double m4, double m5) {
        double total = m1 + m2 + m3 + m4 + m5;
        return total;
    }

    public static double average(double total) {
        double average = total/5.0;
        return average;
    }

    public void reset(){
        System.out.println("Do you want to reset Total Milk Output?\nPress 1 to reset or press any other key to exit.");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x==1)
        {
            total = 0;
            System.out.println("Total Milk Produced is Reset to "+ total);
        }
    }

}