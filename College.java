package exp7;

import java.util.Scanner;

abstract class Course{
    abstract void studentDetails();
}

class Comps extends Course{
    String name;
    int UID;
    int year;

    public void studentDetails(){
        System.out.println("Name: "+name);
        System.out.println("UID: "+UID);
        if (this.year == 1)
            System.out.println("Year: FE");
        else if (this.year == 2)
            System.out.println("Year: SE");
        else if (this.year == 3)
            System.out.println("Year: TE");

    }

}

class IT extends Course{
    String name;
    int UID;
    int year;

    public void studentDetails(){
        System.out.println("Name: "+name);
        System.out.println("UID: "+UID);
        if (this.year == 1)
            System.out.println("Year: FE");
        else if (this.year == 2)
            System.out.println("Year: SE");
        else if (this.year == 3)
            System.out.println("Year: TE");
    }
}


public class College{

    public static void main(String[] args){
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Total number of Students: ");
        num = scanner.nextInt();
        scanner.nextLine();

        Comps[] c = new Comps[num];
        IT [] it = new IT[num];
        int j=0;
        int k=0;

        for (int i=0; i<num; i++){
            System.out.println("Course of Student "+(i+1)+" ?\n1.Comps\n2.IT");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice==1){
                c[j] = new Comps();
                System.out.println("Enter name of student "+(i+1) );
                c[j].name = scanner.nextLine();
                System.out.println("Enter UID of student "+(i+1) );
                c[j].UID = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter Year of student "+(i+1)+"\n1.FE\n2.SE\n3.TE" );
                c[j].year = scanner.nextInt();
                scanner.nextLine();
                j++;
            }

            else {
                it[k] = new IT();
                System.out.println("Enter name of student "+(i+1) );
                it[k].name = scanner.nextLine();
                System.out.println("Enter UID of student "+(i+1) );
                it[k].UID = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter Year of student "+(i+1)+"\n1.FE\n2.SE\n3.TE" );
                it[k].year = scanner.nextInt();
                scanner.nextLine();
                k++;
            }

        }
        int t=1;
        while(t!=0){
            System.out.println("\nWhich course do you wish to view?\n1.Comps\n2.IT\n0.Exit");
            num  = scanner.nextInt();
            scanner.nextLine();
            if (num==1)
                output(c,j);
            else if (num==2)
                output(it,k);
            else t=0;
        }

    }

    public static void output(Comps[] c, int j){
        for (int x=1; x<=3; x++){
            for(int i=0; i<j; i++){
                if (c[i].year == x)
                    c[i].studentDetails();
            }

        }
    }

    public static void output(IT[] it, int k){
        for (int x=1; x<=3; x++){
            for(int i=0; i<k; i++){
                if (it[i].year == x)
                    it[i].studentDetails();
            }

        }
    }
}
