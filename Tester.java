package exp5;

import java.util.*;

class Employee{

    private String name;
    private String ID;
    private int age;

    public Employee(String name, String ID, int age){
        this.setName(name);
        this.setID(ID);
        this.setAge(age);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public String getID(){
        return this.ID;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

}


class SalariedEmployee extends Employee{
    private double empSalary;

    public SalariedEmployee(String name, String ID, int age, double salary){
        super(name,  ID,  age);
        this.setEmpSalary(salary);
    }
    Scanner scanner = new Scanner(System.in);

    public void setEmpSalary(double salary){
        this.empSalary = salary;
        System.out.println("Are you a permanent Employee?(1/0):");
        int c = scanner.nextInt();
        scanner.nextLine();
        if(c==1){
            this.empSalary+=2000;
        }
    }

    public double getEmpSalary(){
        return this.empSalary;
    }

}

public class Tester{
    static int num;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Employees:");
        num = scanner.nextInt();
        SalariedEmployee[] s = new SalariedEmployee[num];


        input(s);
        System.out.println("\n\n");
        output(s);
    }

    public static void input(SalariedEmployee[] s ){
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<num; i++){
            System.out.println("Enter the name of Employee "+(i+1)+":");
            String tempName = scan.nextLine();

            System.out.println("Enter the Id of Employee "+(i+1)+":");
            String tempID = scan.nextLine();

            System.out.println("Enter the age of Employee "+(i+1)+":");
            int tempAge = scan.nextInt();
            scan.nextLine();

            System.out.println("Enter the salary of Employee "+(i+1)+":");
            double tempSalary = scan.nextDouble();
            scan.nextLine();

            s[i] = new SalariedEmployee(tempName,tempID,tempAge,tempSalary);

        }
    }

    public static void output(SalariedEmployee[] s ){
        for(int i=0; i<num; i++){
            System.out.println("Employee "+(i+1)+" name :- "+s[i].getName());

            System.out.println("Employee "+(i+1)+" ID :- "+s[i].getID());

            System.out.println("Employee "+(i+1)+" age :- "+s[i].getAge());

            System.out.println("Employee "+(i+1)+" salary :- "+s[i].getEmpSalary());

        }

        int maxid =0;
        for(int i=0; i<num; i++){
            if(s[i].getEmpSalary() > s[maxid].getEmpSalary())
                maxid = i;
        }

        System.out.println("\nThe employee details with highest salary are:\n");
        System.out.println("Employee name :- "+s[maxid].getName());

        System.out.println("Employee ID :- "+s[maxid].getID());

        System.out.println("Employee age :- "+s[maxid].getAge());

        System.out.println("Employee salary :- "+s[maxid].getEmpSalary());

    }
}
