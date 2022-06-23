package exp6;
import java.util.Scanner;
class Employee{
    double bonus = 0;
    public double getSalary(){
        return 10000;
    }
    public double getBonus(){
        return bonus;
    }
}

class Intern extends Employee{
    //int bonus = 2000;

    public double getSalary(){
        return (3.0/4.0)*super.getSalary();
    }

    public double getBonus(){
        return super.getBonus() + (20.0/100.0)*this.getSalary();
    }
}

class Clerk extends Employee{
    //int bonus = 3000;

    public double getSalary(){
        return (1.0/2.0)*super.getSalary();
    }

    public double getBonus(){
        return super.getBonus() + (20.0/100.0)*this.getSalary();
    }
}

class Manager extends Employee{
    //int bonus = 5000;

    public double getSalary(){
        return (2.0)*super.getSalary();
    }

    public double getBonus(){
        return super.getBonus() + (20.0/100.0)*this.getSalary();
    }
}

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the number of employees:");

        int p=1;
        while(p!=0){
            System.out.println("-------------------------------------------------\nEnter your Role:\n1.Intern.\n2.Clerk.\n3.Manager.\n0.Exit.");
            p = scanner.nextInt();
            switch(p){
                case 1: {Intern intern = new Intern();
                    System.out.println("\nFOR INTERN\nSalary: Rs."+intern.getSalary()+"\nBonus: Rs."+intern.getBonus()+"\nTotal Pay: Rs."+(intern.getSalary()+intern.getBonus())) ;
                    break;}
                case 2: {Clerk clerk = new Clerk();
                    System.out.println("\nFOR CLERK\nSalary: Rs."+clerk.getSalary()+"\nBonus: Rs."+clerk.getBonus()+"\nTotal Pay: Rs."+(clerk.getSalary()+clerk.getBonus())) ;
                    break;}
                case 3: {Manager manager = new Manager();
                    System.out.println("\nFOR MANAGER\nSalary: Rs."+manager.getSalary()+"\nBonus: Rs."+manager.getBonus()+"\nTotal Pay: Rs."+(manager.getSalary()+manager.getBonus())) ;
                    break;}
                case 0: {System.out.println("Thank You!");break; }

            }

        }
	/*

	Intern intern = new Intern();
	System.out.println("\nFOR INTERN\nSalary: Rs."+intern.getSalary()+"\nBonus: Rs."+intern.getBonus()+"\nTotal Pay: Rs."+(intern.getSalary()+intern.getBonus())) ;

	Clerk clerk = new Clerk();
	System.out.println("\nFOR CLERK\nSalary: Rs."+clerk.getSalary()+"\nBonus: Rs."+clerk.getBonus()+"\nTotal Pay: Rs."+(clerk.getSalary()+clerk.getBonus())) ;

	Manager manager = new Manager();
	System.out.println("\nFOR MANAGER\nSalary: Rs."+manager.getSalary()+"\nBonus: Rs."+manager.getBonus()+"\nTotal Pay: Rs."+(manager.getSalary()+manager.getBonus())) ;

	*/

    }
}


