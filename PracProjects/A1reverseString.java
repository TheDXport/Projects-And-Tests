package PracProjects;

import java.util.Scanner;

public class A1reverseString {

    public static void main(String [] args) {

        try (Scanner s = new Scanner(System.in)) {
            String word = s.nextLine();
      
   char ch;
   String nstr = "";


     for (int i=0; i<word.length(); i++)
     {
            ch= word.charAt(i); //extracts each character
            nstr = ch + nstr; //adds each character in front of the existing string
     }
     System.out.println("Reversed word: "+ nstr);
        }


    }
    



}