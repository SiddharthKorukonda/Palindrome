/* Siddharth Korukonda
   115607752
   CSE 114
   Paul Fodor
   Homework 3
   Question 1 (Palindrome.java)
 */

import java.util.*;

public class Palindrome {
    public static boolean Palindrome(String input) {
        String inputModified1 = input.toLowerCase();
        String inputModified = inputModified1.replace(" ","");

        int length = inputModified.length();

        for (int i=0; i<length/2; i++) {
            if (inputModified.charAt(i)!=inputModified.charAt((length-1)-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string input: ");
        String input = s.nextLine();

        if (Palindrome(input)) {
            System.out.print("Input string "+input+" is a palindrome");
        }
        else {
            System.out.print("Input string "+input+" is not a palindrome");
        }
    }
}
