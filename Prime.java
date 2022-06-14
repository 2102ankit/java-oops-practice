package exp1;

/*write a program to find all prime numbers inm the given range print the prime numbers and total number of prime numbers. use concept of class and objects*/

import java.util.Scanner;
public class Prime{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the start of Range:");
        int start = scan.nextInt();
        System.out.println("Enter the End of Range:");
        int end = scan.nextInt();
        Prime p = new Prime();
        p.printPrime(start,end);

    }//end main

    private static void printPrime(int start, int end) {
        int ctr=0;
        System.out.println("Prime numbers between "+start+" &"+end+" are:");
        for (int i = start; i <=end; i++) {
                if (isPrime(i)==1)
                { System.out.println(i);
                    ctr++;}
        }
        System.out.println("There are "+ctr+" Prime numbers in the range.");
    }// end printPrime

    public static int isPrime(int n){
        if (n==1)
            return 0;
        else if (n==2)
            return 1;
        else {
            for (int j = 2; j <=n/2 ; j++) {
                if (n%j==0)
                    return 0;
            }
        return 1;
        }

    } // end isPrime method

}

// start end , method for prime, counter for prime nos
