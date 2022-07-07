package exp8;

import java.util.Scanner;

interface SavingsAccount{
    double getSimpleInterest(double t);
}

interface CurrentAccont{
    double getCompoudInterest(double t);
}

public class Customer implements SavingsAccount, CurrentAccont {
    int accType; // 1. sav 2. curr
    double roi;
    double balance;

    public Customer (int accType, double roi, double balance){
        this.accType =accType;
        this.roi = roi;
        this.balance = balance;
    }

    public double getSimpleInterest(double t){
        //todo time s a
        double i = this.balance*t*this.roi/100.0;
        return i;
    }

    public double getCompoudInterest(double t){
        //todo
        double x = (1+this.roi/100.0);
        double i = this.balance*( Math.pow(x,t) - 1 );
        return i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int accType; // 1. sav 2. curr
        double roi;
        double balance;
        double t;

        int option = 1;

        while(option!=0){

            System.out.println("\nEnter your Account Type:\n\t1.Savings Acccount\n\t2.Current Account");
            accType = scanner.nextInt();

            System.out.println("Enter the rate of Interest p.c.p.a.:");
            roi = scanner.nextDouble();

            System.out.println("Enter the Balance you want to Deposit:");
            balance = scanner.nextDouble();

            System.out.println("Enter the Period of Time (in years) for which you wish to Deposit:");
            t = scanner.nextDouble();


            Customer ct = new Customer (accType,roi,balance);

            if (ct.accType ==1){
                System.out.println("\n--------------------------------------------------------\nSimple Interest On Your Balance is = "+ct.getSimpleInterest(t) +"\n--------------------------------------------------------\n"	);
            }
            else {
                System.out.println("\n--------------------------------------------------------\nCompound Interest On Your Balance is = "+ct.getCompoudInterest(t) +"\n--------------------------------------------------------\n"		);
            }

            System.out.println("\nDo you want to continue?\n1.Continue\n0.Exit");
            option = scanner.nextInt();
            if(option==0)
                System.out.println("Thank You!");

        }

    }
}