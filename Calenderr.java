package exp6;

import java.util.*;
import java.lang.Math;

class Bank{
    double rate_of_interest = 2.0;
    double deposit;
    public double get_rate_of_interest(int days){
        return rate_of_interest;
    }

}


class SBI extends Bank{
    int days;
    double capital;

    public double get_rate_of_interest(int days){
        if(days< 7)
            return 2.0;
        else if (days <= 45)
            return 3.00;
        else if (days <= 90)
            return  4.05;
        else if (days <= 120)
            return  4.10;
        else if (days <= 180)
            return 4.10;

        return 4.10;
    }

}


class ICICI extends Bank{
    int days;
    double capital;

    public double get_rate_of_interest(int days){
        if(days<7)
            return 2.0;
        else if (days <= 14)
            return 3.10;
        else if (days <= 30)
            return  3.20;
        else if (days <= 45)
            return 3.50;
        else if (days <= 90)
            return  4.50;
        else if (days <= 120)
            return  4.70;
        else if (days <= 180)
            return 4.90;

        return 4.90;
    }

}


class AXIS extends Bank{
    int days;
    double capital;

    public double get_rate_of_interest(int days){
        if(days<7)
            return 2.0;
        else if (days <= 30)
            return  3.15;
        else if (days <= 45)
            return  3.45;
        else if (days <= 90)
            return  4.05;
        else if (days <= 120)
            return  4.70;
        else if (days <= 180)
            return  5.00;

        return 5.00;
    }

}

public class Calenderr{

    public static void main(String [] args){
        int days;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of days:");
        days = scanner.nextInt();

        SBI s = new SBI();
        s.capital = (1 + s.get_rate_of_interest(days)/100 )*10000;
        s.days = days;

        ICICI i = new ICICI();
        i.capital =(1+ i.get_rate_of_interest(days)/100)*12500;
        i.days = days;

        AXIS a = new AXIS();
        a.capital =(1+ a.get_rate_of_interest(days)/100)*20000;
        a.days = days;

        int p=1;
        while(p!=0){
            System.out.println("Enter Choice:\n1.View Balance in SBI Bank.\n2.View Balance in ICICI Bank.\n3.View Balance in AXIS Bank.\n0.Exit.");
            p = scanner.nextInt();
            switch(p){
                case 1: {output(s,s.capital,days);	System.out.println("D = "+s.days); break;	}
                case 2: {output(i,i.capital,days);		System.out.println("D = "+i.days); break;}
                case 3: {output(s,a.capital,days); System.out.println("D = "+a.days);	break;	}
                case 0: {System.out.println("Thank You!");break; }

            }

        }

    }

    public static void output(SBI s, double capital, int days){
        double r = s.get_rate_of_interest(days);
        double x = (1 + r/100);
        double t = days/365;
        double amount = capital*Math.pow(x,t);

        System.out.println("Balance in account = Rs."+amount);
    }





























    public static void output(ICICI i, double capital, int days){
        double r = i.get_rate_of_interest(days);
        double x = (1 + r/100);
        double t = days/365;
        double amount = capital*Math.pow(x,t);

        System.out.println("Balance in account = Rs."+amount);
    }
    public static void output(AXIS a, double capital, int days){
        double r = a.get_rate_of_interest(days);
        double x = (1 + r/100);
        double t = days/365;
        double amount = capital*Math.pow(x,t);

        System.out.println("Balance in account = Rs."+amount);
    }
}
