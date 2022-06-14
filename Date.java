package exp3;

import java.util.*;
public class Date{

    int year;
    int month;
    int date;
    int hrs;
    int min;
    int sec;
    int flag;

    public Date(){
        this.year = 2000;
        this.month = 1;
        this.date = 1;
        this.hrs = 0;
        this.min = 0;
        this.sec = 0;
        this.flag = 3;
    }

    public void setDate(int year,int month,int date,int hrs,int min,int sec){
        this.year = year;
        this.month = month;
        this.date = date;
        this.hrs = hrs;
        this.min = min;
        this.sec = sec;
        this.flag = 3;
    }

    public void setDate(int year,int month,int date,int hrs,int min){
        this.year = year;
        this.month = month;
        this.date = date;
        this.hrs = hrs;
        this.min = min;
        this.flag = 2;
    }

    public void setDate(int year,int month,int date){
        this.year = year;
        this.month = month;
        this.date = date;
        this.flag = 1;
    }

    public void displayDate(){
        System.out.println("-----------------------------------------");
        if(this.flag==3)
            System.out.println(this.date+"/"+this.month+"/"+this.year+" "+this.hrs+":"+this.min+":"+this.sec);
        else if(this.flag==2)
            System.out.println(this.date+"/"+this.month+"/"+this.year+" "+this.hrs+":"+this.min);
        else if(this.flag==1)
            System.out.println(this.date+"/"+this.month+"/"+this.year);
        System.out.println("-----------------------------------------");
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of dates:");
        int number = scan.nextInt();
        Date[] d = new Date[number];

        for(int i=0; i<number; i++)
        {	d[i] = new Date();
            d[i].dateInput(d[i]);
        }

        for(int i=0; i<number; i++)
        {
            d[i].displayDate();
        }

        System.out.println("Enter the number of dates you want to reset:");
        int resetNumber = scan.nextInt();
        for(int i=0; i<resetNumber; i++)
        {	System.out.println("Which date do you want to reset?");
            int t = scan.nextInt();
            d[t-1].resetDate();
        }
        for(int i=0; i<number; i++)
        {
            d[i].displayDate();
        }


    }

    public void resetDate(){
        if(this.flag==1){
            this.year = 0;
            this.month = 0;
            this.date = 0;
        }
        else if(this.flag==2){
            this.year = 0;
            this.month = 0;
            this.date = 0;
            this.hrs = 0;
            this.min = 0;
        }
        else if(this.flag==3){
            this.year = 0;
            this.month = 0;
            this.date = 0;
            this.hrs = 0;
            this.min = 0;
            this.sec = 0;
        }
    }

    public void dateInput(Date d){
        Scanner scanner = new Scanner(System.in);

        int x;
        System.out.println("Enter appropriate Choice:\n1.dd/mm/yyyy\n2.dd/mm/yyyy hrs:min\n3.dd/mm/yyyy hrs:min:sec");
        x = scanner.nextInt();
        switch(x){
            case 1:
            {	System.out.println("Enter date:");
                int dd = scanner.nextInt();
                System.out.println("Enter month:");
                int mm = scanner.nextInt();
                System.out.println("Enter year:");
                int yyyy = scanner.nextInt();
                d.setDate(yyyy,mm,dd);
                break;
            }
            case 2:
            {	System.out.println("Enter date:");
                int dd = scanner.nextInt();
                System.out.println("Enter month:");
                int mm = scanner.nextInt();
                System.out.println("Enter year:");
                int yyyy = scanner.nextInt();
                System.out.println("Enter hours:");
                int hr = scanner.nextInt();
                System.out.println("Enter minutes:");
                int mi = scanner.nextInt();
                d.setDate(yyyy,mm,dd,hr,mi);
                break;
            }
            case 3:
            {	System.out.println("Enter date:");
                int dd = scanner.nextInt();
                System.out.println("Enter month:");
                int mm = scanner.nextInt();
                System.out.println("Enter year:");
                int yyyy = scanner.nextInt();
                System.out.println("Enter hours:");
                int hr = scanner.nextInt();
                System.out.println("Enter minutes:");
                int mi = scanner.nextInt();
                System.out.println("Enter seconds:");
                int sc = scanner.nextInt();
                d.setDate(yyyy,mm,dd,hr,mi,sc);
                break;
            }

        }
    }

}