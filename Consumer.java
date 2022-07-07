package exp8;

import java.util.Scanner;

interface EatItHere{
    void deliverOrder();
    double gstEatHere();

}

interface TakeAway{
    void dispatchOrder();
    double gstTakeAway();

}

public class Consumer implements EatItHere,TakeAway{
    int orderType;
    static int orderNumber = 2021070700;
    double orderPrice;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consumer consumer = new Consumer();
        int x = 1;
        int sum=0;

        while(x!=0){
            System.out.println("\nDo you wish to place an order?\n1.Yes\n0.Exit.");
            orderNumber +=1;
            x = scanner.nextInt();
            if (x==1){

                int t=1;
                sum=0;
                System.out.println("\n~~~~~~~~~~~~~~~~~MENU~~~~~~~~~~~~~~~~~\n");
                System.out.println("1.Sandwich\tRs.250\n2.Mexican Tacos\tRs.150\n3.Drinks\tRs.150\n4.Burger\tRs.250\n5.Pizza\t\tRs.350\n6.Chicken\tRs.300\n7.Fries\t\tRs.200\n8.Hot Dog\tRs.250\n9.Coffee\tRs.150\n10.Donuts\tRs.150\n0. No More Items!");
                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                System.out.println("Enter item number to add to order list.");
                while(t!=0){
                    t = scanner.nextInt();
                    switch(t){
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 9: {	sum+=250;	break;}
                        case 2:
                        case 4:
                        case 6:
                        case 8:
                        case 10: {	sum+=150;	break;}
                        case 0: {System.out.println("Order Taken!");
                        }
                    }
                }
                consumer.orderPrice = sum;

                System.out.println("\nEnter your Order Type:\n1.Eat It Here.\n2.Take Away.");
                consumer.orderType = scanner.nextInt();

                switch( consumer.orderType ){
                    case 1:{consumer.deliverOrder();
                        break;}
                    case 2:{consumer.dispatchOrder();
                        break;}
                }
            }
            else System.out.println("\nThank You!");
        }
    }

    public void deliverOrder(){

        int value=18;
        if(this.orderPrice< 1000)
            value = 14;
        double charge = 0.1*this.orderPrice ;
        double gst = this.gstEatHere();
        System.out.println("-------------------------------------------");
        System.out.println("Order Number: "+ orderNumber);

        System.out.println("Price of food items = Rs."+this.orderPrice);

        if ( 500 > 0.1*this.orderPrice )
            charge = 500;
        if(this.orderPrice> 1000)
            charge = 0;

        double netPrice = this.orderPrice + charge + gst;
        System.out.println("Service Charge = Rs."+charge);
        System.out.println("GST @"+value+"% = Rs."+ gst);
        System.out.println("Total Bill = Rs."+netPrice);
        System.out.println("-------------------------------------------\n");
    }

    public void dispatchOrder(){

        int value=8;
        if(this.orderPrice< 1000)
            value = 4;
        double charge = 0.05*this.orderPrice ;
        double gst = this.gstTakeAway();
        System.out.println("-------------------------------------------");
        System.out.println("Order Number: "+ orderNumber);
        System.out.println("Price of food items = Rs."+this.orderPrice);

        if ( 45 > 0.1*this.orderPrice )
            charge = 45;
        if(this.orderPrice > 1000)
            charge = 0;

        double netPrice = this.orderPrice + charge + gst;
        System.out.println("Convenience Fee = Rs."+charge);
        System.out.println("GST @"+value+"% = Rs."+ gst);
        System.out.println("Total Bill = Rs."+netPrice);
        System.out.println("-------------------------------------------\n");
    }

    public double gstEatHere(){
        double gst;
        if(this.orderPrice < 1000)
        { gst  = 0.14*this.orderPrice;}
        else
        { gst  = 0.18*this.orderPrice;}
        return gst;
    }

    public double gstTakeAway(){
        double gst;
        if(this.orderPrice < 1000)
        { gst  = 0.4*this.orderPrice;}
        else
        { gst  = 0.8*this.orderPrice;}
        return gst;
    }

}