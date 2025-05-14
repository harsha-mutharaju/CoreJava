package Assignment_2_May07;

import java.util.Scanner;

//1. Write a Java program to check if a string is a palindrome.
// what is palindrome? if a string is equal to reverse of string, then its a palindrome

public class Assignment_2_1
{
    public static void main(String[] args) {

        System.out.println("\nEnter a String to check if it is a palindrome :\n");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = "";

        for(int i = str1.length()-1; i >= 0; i--){
            str2 += str1.charAt(i);
        }
        if(str2.equals(str1)){
            System.out.println( str1 + " is a palindrome");
        }
        else{
            System.out.println(str1 + "is not palindrome");
        }
    }
}
