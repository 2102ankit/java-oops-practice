package exp4;

import java.util.*;

public class Editor{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        String paragraph;
        System.out.println("Enter the Paragraph");
        paragraph = scanner.nextLine();

        String temp[] = paragraph.split(" ");

//        System.out.println("Enter word whose count is to be found: ");
//        String wordC = scanner.nextLine();
//
//        int count = 0;
//        for (int i = 0; i < temp.length; i++) {
//            if (wordC.equals(temp[i]))
//                count++;
//        }
//
//        System.out.println("The word " + wordC + " occurs " + count + " times in the above Paragraph");
//
//        System.out.println("Enter word which is to be deleted: ");
//        String wordD = scanner.nextLine();
//
//
//        for (int i = 0; i < temp.length; i++) {
//            if (wordD.equals(temp[i]))
//                temp[i]="";
//        }
//
//        StringBuffer sb = new StringBuffer();
//        for(int i = 0; i < temp.length; i++) {
//            if(temp[i].equals(""))
//                continue;
//            sb.append(temp[i]+" ");
//        }
//        paragraph = sb.toString();
//
//        System.out.println("\n------------After deleting------------\n"+paragraph);
//
//
//        System.out.println("\nEnter word which is to be replaced: ");
//        String wordR = scanner.nextLine();
//        System.out.println("\nEnter word with which it is to be replaced: ");
//        String wordW = scanner.nextLine();
//
//
//        for (int i = 0; i < temp.length; i++) {
//            if (wordR.equals(temp[i]))
//                temp[i]=wordW;
//        }
//
//        StringBuffer sb1 = new StringBuffer();
//        for(int i = 0; i < temp.length; i++) {
//            if(temp[i].equals(""))
//                continue;
//            sb1.append(temp[i]+" ");
//        }
//        paragraph = sb1.toString();
//
//        System.out.println("\n------------After Replacing------------\n"+paragraph);
//
//
//        System.out.println("Enter word which is to be capitalized: ");
//        String wordCap = scanner.nextLine();
//        String wordCapCopy = wordCap.toUpperCase();
//
//        for (int i = 0; i < temp.length; i++) {
//            if (wordCap.equals(temp[i]))
//                temp[i]=wordCapCopy;
//        }
//
//        StringBuffer sb2 = new StringBuffer();
//        for(int i = 0; i < temp.length; i++) {
//            if(temp[i].equals(""))
//                continue;
//            sb2.append(temp[i]+" ");
//        }
//        paragraph = sb2.toString();
//
//        System.out.println("\n------------After Capitalising------------\n"+paragraph);

        wordCount(temp);
        wordDelete(temp,paragraph);
        wordReplace(temp,paragraph);
        wordCapitalise(temp,paragraph);
    }// end main

    public static void wordCount(String temp[]){
        System.out.println("Enter word whose count is to be found: ");
        String wordC = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (wordC.equals(temp[i]))
                count++;
        }

        System.out.println("The word " + wordC + " occurs " + count + " times in the above Paragraph");

    }//end count

    public static void wordDelete(String temp[],String paragraph){
        System.out.println("Enter word which is to be deleted: ");
        String wordD = scanner.nextLine();


        for (int i = 0; i < temp.length; i++) {
            if (wordD.equals(temp[i]))
                temp[i]="";
        }

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < temp.length; i++) {
            if(temp[i].equals(""))
                continue;
            sb.append(temp[i]+" ");
        }
        paragraph = sb.toString();

        System.out.println("\n------------After deleting------------\n"+paragraph);

    }// end delete

    public static void wordReplace(String temp[],String paragraph){
        System.out.println("\nEnter word which is to be replaced: ");
        String wordR = scanner.nextLine();
        System.out.println("\nEnter word with which it is to be replaced: ");
        String wordW = scanner.nextLine();


        for (int i = 0; i < temp.length; i++) {
            if (wordR.equals(temp[i]))
                temp[i]=wordW;
        }

        StringBuffer sb1 = new StringBuffer();
        for(int i = 0; i < temp.length; i++) {
            if(temp[i].equals(""))
                continue;
            sb1.append(temp[i]+" ");
        }
        paragraph = sb1.toString();

        System.out.println("\n------------After Replacing------------\n"+paragraph);

    }// end replace

    public static void wordCapitalise(String temp[],String paragraph){
        System.out.println("Enter word which is to be capitalized: ");
        String wordCap = scanner.nextLine();
        String wordCapCopy = wordCap.toUpperCase();

        for (int i = 0; i < temp.length; i++) {
            if (wordCap.equals(temp[i]))
                temp[i]=wordCapCopy;
        }

        StringBuffer sb2 = new StringBuffer();
        for(int i = 0; i < temp.length; i++) {
            if(temp[i].equals(""))
                continue;
            sb2.append(temp[i]+" ");
        }
        paragraph = sb2.toString();

        System.out.println("\n------------After Capitalising------------\n"+paragraph);

    }// end capital

}
