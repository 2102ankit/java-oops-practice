package exp2;

import java.util.Scanner;

public class Student {
    String studentName;
    String sId;
    double percentage;
    char grade;

//    public Student(String name, String id, Double percent){
//        percentage = percent;
//        studentName = name;
//        sId = id;
//    }

    public static void main(String[] args) {
        //Student s = new Student("Jayraj","Comps",96.96);
        //s.printDetails();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numOfStudents = scanner.nextInt();
        Student[] s = new Student[numOfStudents];

        Student stu = new Student();
        stu.enterDetails(numOfStudents,s);

        int  y=1;
        while(y!=0){
            System.out.println("\nWhat do you  want to do?");
            System.out.println("1.Print Details.\n2.Sort as per Name.\n3.Sort as per ID.\n4.Sort as per Grade.\n0.Exit");
            y = scanner.nextInt();
            switch (y) {
                case 1 ->stu.printDetails(numOfStudents,s);
                case 2 -> stu.sortAsPerName(numOfStudents,s);
                case 3 -> stu.sortAsPerId(numOfStudents,s);
                case 4 -> stu.sortAsPerGrade(numOfStudents,s);
                case 0 -> y=0;
                default -> System.out.println("Please select again!");
            }
        }
        System.out.println("Thank You!");

    }

    public void enterDetails(int n, Student[] s){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n ; i++) {
            s[i]= new Student();

            System.out.println("\nEnter name of student "+(i+1)+":");
            s[i].studentName = sc.nextLine();

            System.out.println("Enter ID of student "+(i+1)+":");
            s[i].sId = sc.nextLine();

            System.out.println("Enter percentage of student "+(i+1)+":");
            s[i].percentage = sc.nextDouble();
            sc.nextLine();

            if (s[i].percentage > 90)
                s[i].grade = 'A';

            else if (s[i].percentage > 80) {
                s[i].grade = 'B';
            }
            else if (s[i].percentage > 70) {
                s[i].grade = 'C';
            }
            else if (s[i].percentage > 60) {
                s[i].grade = 'D';
            }
            else if (s[i].percentage > 50) {
                s[i].grade = 'E';
            }
            else s[i].grade = 'F';

        }
    }

    public void printDetails(int n,Student[] st){
        System.out.println("\nStudent Details are as follows:");
        for(int i=0; i<n; i++) {
            System.out.println("Name : " + st[i].studentName);
            System.out.println("ID: " + st[i].sId);
            System.out.println("Percentage: " + st[i].percentage + "%");
            System.out.println("Grade: " + st[i].grade);
        }
    }

    public void sortAsPerName(int n,Student[] st){
        for (int i = 0; i < n-1; i++) {
            int minInd = i;
            for (int j = i+1; j <n ; j++) {
                int x = st[j].studentName.compareTo(st[minInd].studentName);
                if(x<0) minInd = j;

            }
            Student tempS = st[i];
            st[i]= st[minInd];
            st[minInd]= tempS;
        }
        System.out.println("Students are now sorted according to Name");

    }

    public void sortAsPerId(int n,Student[] st){
        for (int i = 0; i < n-1; i++) {
            int minInd = i;
            for (int j = i+1; j <n ; j++) {
                int x = st[j].sId.compareTo(st[minInd].sId);
                if(x<0) minInd = j;

            }
            Student tempS = st[i];
            st[i]= st[minInd];
            st[minInd]= tempS;
        }
        System.out.println("Students are now sorted according to ID");

    }

    public void sortAsPerGrade(int n,Student[] st){
        for (int i = 0; i < n-1; i++) {
            int minInd = i;
            for (int j = i+1; j <n ; j++) {
                if (st[j].grade < st[minInd].grade)
                    minInd = j;
            }
            Student tempS = st[i];
            st[i]= st[minInd];
            st[minInd]= tempS;
        }
        System.out.println("Students are now sorted according to Grade");

    }

}
