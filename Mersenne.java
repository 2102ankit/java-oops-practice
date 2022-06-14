package exp1;

import static college.Prime.isPrime;
import static java.lang.Math.pow;

public class Mersenne {
    public static void main(String[] args) {
        Mersenne m= new Mersenne();
        m.printNumbers();
        m.mersenne();
    }// end main
    public void printNumbers(){
        for(int p=2; p<32; p++)
        {
            double x= pow(2,p) - 1;
            System.out.println(x);
        }
    }// end print method

    public void mersenne(){
        System.out.println("\n\nPrime numbers are");
        for(int p=2; p<32; p++)
        {
            double x= (pow(2,p) - 1.0);
            int y = isPrime((int)x);
            if(y==1)
                System.out.println("Number = "+x+" for p = "+p);
        }
    }// end mersenne method
}// end class