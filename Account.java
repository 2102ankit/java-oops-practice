package exp1;

import java.util.Scanner;

public class Account {
    String name;
    int accountNumber;
    String type;
    float amount;

    public static void main(String[] args) {
    Account acc = new Account();
    acc.input();
    acc.options();
    }// end main method

    public void input(){
        String s;
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account Holder's Name:");
        s = scanner.nextLine();
        this.name= s;

        System.out.println("Enter Account Number:");
        i = scanner.nextInt();
        this.accountNumber= i;
        scanner.nextLine();

        System.out.println("Enter Account Type:\n1.Savings\n2.Current\n3.Fixed Deposit");
        i = scanner.nextInt();
        if(i==1)
            this.type="Savings";
        else if (i==2)
            this.type="Current";
        else if(i==3)
            this.type="Fixed Deposit";
        else
            this.type="Savings"; // default


        System.out.println("Enter Initial Balance amount:");
        this.amount= scanner.nextFloat();
    }// end input method

    public void options(){
        int ch =1;
        while(ch!=0) {
            System.out.println("\n---------------------");
            System.out.println("Select the appropriate action:");
            System.out.println("1.Deposit amount\n2.Withdraw\n3.Display balance\n0.Exit");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();

            switch (x) {
                case 0 -> {
                    System.out.println("Thank you!");
                    ch = 0;
                }
                case 1 -> Deposit();
                case 2 -> withdraw();
                case 3 -> Display();
                default -> System.out.println("Choice not available!!");
            }
        }
    }// end options method

    private void Display() {
        System.out.println("Account Holder's name: "+name);
        System.out.println("Account Balance: "+amount);
    }// end display method

    private void Deposit() {
        System.out.println("Enter amount to be Deposited:");
        Scanner sc = new Scanner(System.in);
        float x= sc.nextFloat();
        amount+=x;
    }// end deposit method

    private void withdraw() {
        System.out.println("Enter amount to be withdrawn:");
        Scanner sc = new Scanner(System.in);
        float x= sc.nextFloat();
        if(amount-x<0)
            System.out.println("Can't withdraw! Amount not available.");
        else
            amount-=x;
    }// end withdraw method

}
