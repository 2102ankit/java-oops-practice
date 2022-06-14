package exp3;

import java.util.*;

public class Posting {

    int courseWork;
    int aptTest;
    int techTest;
    int interview;
    int flag;

    int m, n, o, t, q, r, s;

    public Posting() {

    }

    public Posting(int courseWork, int aptTest, int techTest, int interview) {
        this.courseWork = courseWork;
        this.aptTest = aptTest;
        this.techTest = techTest;
        this.interview = interview;
        this.flag = 4;
    }

    public Posting(int techTest, int interview) {
        this.techTest = techTest;
        this.interview = interview;
        this.flag = 2;
    }

    public Posting(int interview) {
        this.interview = interview;
        this.flag = 1;
    }

    public static void main(String[] args) {
        Posting pp = new Posting();
        pp.inputData();
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Employees that are employing");
        int num = scanner.nextInt();
        Posting[] p = new Posting[num];

        for (int i = 0; i < num; i++) {
            Scanner scan = new Scanner(System.in);
            int x;
            System.out.println("Which role do you want to apply for?\n1.Programmer\n2.Team Leader\n3.Project Manager");
            x = scan.nextInt();
            switch (x) {
                case 1 -> {
                    System.out.println("Enter marks for Course Work.");
                    int cw = scan.nextInt();
                    System.out.println("Enter marks for Aptitude Test.");
                    int at = scan.nextInt();
                    System.out.println("Enter marks for Technical Test.");
                    int tt = scan.nextInt();
                    System.out.println("Enter marks for Interview.");
                    int iv = scan.nextInt();
                    p[i] = new Posting(cw, at, tt, iv);
                }
                case 2 -> {
                    System.out.println("Enter marks for Technical Test.");
                    int tt = scan.nextInt();
                    System.out.println("Enter marks for Interview.");
                    int iv = scan.nextInt();
                    p[i] = new Posting(tt, iv);
                }
                case 3 -> {
                    System.out.println("Enter marks for Interview.");
                    int iv = scan.nextInt();
                    p[i] = new Posting(iv);
                }
            }// switch case ends

        }

        System.out.println("What is course work criteria for programmers? ");
        m = scanner.nextInt();
        System.out.println("What is aptitude test criteria for programmers? ");
        n = scanner.nextInt();
        System.out.println("What is technical test criteria for programmers? ");
        o = scanner.nextInt();
        System.out.println("What is interview criteria for programmers? ");
        t = scanner.nextInt();
        System.out.println("What is technical test criteria for Team Leader? ");
        q = scanner.nextInt();
        System.out.println("What is interview criteria for Team Leader? ");
        r = scanner.nextInt();
        System.out.println("What is interview criteria for Project Manager? ");
        s = scanner.nextInt();

        output(p, num);

    }// end method

    public void output(Posting[] p, int num) {

        System.out.println("--------------------------------\nEligible Programmers are :");
        for (int i = 0; i < num; i++) {
            if (p[i].flag == 4 && p[i].display() == 1) {
                System.out.println("Employee " + (i + 1) + " is Eligible");
                p[i].printDetails();
            }
        }

        System.out.println("\n--------------------------------\nEligible Team Leaders are :");
        for (int i = 0; i < num; i++) {
            if (p[i].flag == 2 && p[i].display() == 1) {
                System.out.println("Employee " + (i + 1) + " is Eligible");
                p[i].printDetails();
            }
        }

        System.out.println("\n--------------------------------\nEligible Project managers are :");
        for (int i = 0; i < num; i++) {
            if (p[i].flag == 1 && p[i].display() == 1) {
                System.out.println("Employee " + (i + 1) + " is Eligible");
                p[i].printDetails();
            }
        }

    }

    public void printDetails() {
        if (this.flag == 4)
            System.out.println("Course work :" + this.courseWork + "\nAptitude Test :" + this.aptTest
                    + "\nTechnical test :" + this.techTest + "\nInterview :" + this.interview);
        if (this.flag == 2)
            System.out.println("Technical test :" + this.techTest + "\nInterview :" + this.interview);
        if (this.flag == 1)
            System.out.println("Interview :" + this.interview);
    }

    public int display() {
        if (this.flag == 4) {
            if (this.courseWork >= m && this.aptTest >= n && this.techTest >= o && this.interview >= t)
                return 1;
            else
                return 0;
        }

        if (this.flag == 2) {
            if (this.techTest >= q && this.interview >= r)
                return 1;
            else
                return 0;
        }

        if (this.flag == 1) {
            if (this.interview >= s)
                return 1;
            else
                return 0;
        }
        return 0;
    }// end display method

}
