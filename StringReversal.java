package exp1;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();
        for (int i = 0; i < arr.length/2; i++)
        {
            char temp = arr[i];
            arr[i]=arr[arr.length - i-1];
            arr[arr.length - i-1]=temp;
        }

        for (char c : arr) {
            System.out.print(c);
        }


        }

    }



