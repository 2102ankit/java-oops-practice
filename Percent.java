package exp7;


import java.util.*;
abstract class Marks{
    abstract double getPercentage();
}

class A extends Marks{
    double physics;
    double chemistry;
    double maths;


    public A(double physics, double chemistry, double maths){
        this.physics = physics;
        this.chemistry = chemistry;
        this.maths = maths;
    }

    public double getPercentage(){
        return (physics+chemistry+maths)/3.0;

    }

}


class B extends Marks{
    double physics;
    double chemistry;
    double maths;
    double biology;



    public B(double physics, double chemistry, double maths, double biology){
        this.physics = physics;
        this.chemistry = chemistry;
        this.maths = maths;
        this.biology = biology;
    }

    public double getPercentage(){
        return (physics+chemistry+maths+biology)/4.0;

    }

}

class Struct{
    String name;
    double value;
}


public class Percent{
    public static void main(String[] args ){
        Scanner s = new Scanner(System.in);

        Struct[] sa = new Struct[3];
        System.out.println("------------------------------------------\n");
        System.out.println("Enter marks for Physics of A:");
        sa[0] = new Struct();
        sa[0].name = "Physics";
        sa[0].value = s.nextInt();

        System.out.println("Enter marks for Chemistry of A:");
        sa[1] = new Struct();
        sa[1].name = "Chemistry";
        sa[1].value = s.nextInt();

        System.out.println("Enter marks for Maths of A:");
        sa[2] = new Struct();
        sa[2].name = "Maths";
        sa[2].value = s.nextInt();

        A a = new A(sa[0].value,sa[1].value,sa[2].value);
        System.out.println("------------------------------------------\n");
        Struct[] sb = new Struct[4];

        System.out.println("Enter marks for Physics of B:");
        sb[0] = new Struct();
        sb[0].name = "Physics";
        sb[0].value = s.nextInt();

        System.out.println("Enter marks for Chemistry of B:");
        sb[1] = new Struct();
        sb[1].name = "Chemistry";
        sb[1].value = s.nextInt();

        System.out.println("Enter marks for Maths of B:");
        sb[2] = new Struct();
        sb[2].name = "Maths";
        sb[2].value = s.nextInt();

        System.out.println("Enter marks for Biology of B:");
        sb[3] = new Struct();
        sb[3].name = "Biology";
        sb[3].value = s.nextInt();

        B b = new B(sb[0].value,sb[1].value,sb[2].value,sb[3].value);
        System.out.println("\n------------------------------------------\n");

        System.out.println("Percentage of A = "+(a.getPercentage() )+"%" );
        System.out.println("Percentage of B = "+(b.getPercentage() )+"%" );

        System.out.println("\n------------------------------------------\n");

        for(int i=0; i<2; i++){
            int min_indx = i;
            for (int j = i+1; j < 3; j++) {
                if (sa[j].value < sa[min_indx].value)
                {
                    min_indx = j;
                }
                Struct temp = sa[i];
                sa[i] = sa[min_indx];
                sa[min_indx] = temp;

            }
        }

        for(int i=0; i<3; i++){
            int min_indx = i;
            for (int j = i+1; j < 4; j++) {
                if (sb[j].value < sb[min_indx].value)
                {
                    min_indx = j;
                }
                Struct temp = sb[i];
                sb[i] = sb[min_indx];
                sb[min_indx] = temp;

            }
        }



        System.out.println("\nMarks of A in Descending order:");
        for(int i=0; i<3; i++){
            System.out.println(sa[2-i].name + ": "+ sa[2-i].value);
        }

        System.out.println("\n------------------------------------------\n");
        System.out.println("\nMarks of B in Descending order:");
        for(int i=0; i<4; i++){
            System.out.println(sb[3-i].name + ": "+ sb[3-i].value);
        }
    }


}





