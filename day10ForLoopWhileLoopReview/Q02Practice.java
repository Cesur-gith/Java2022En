package day10ForLoopWhileLoopReview;

import java.util.Scanner;

public class Q02Practice {

    public static void main(String[] args) {

             /*
                Write a Java program to take the last three characters
                from a given string and add these three characters
                 at both the front and back of the string.
                String length must be at least three and more.
                INPUT      : Ankara
                   OUTPUT  : araAnkaraara
                 */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");

        String str = scan.nextLine().trim(); // Catch the string

        if (str.length()>2){
            System.out.println(str.substring(str.length()-3) + str + str.substring(str.length()-3));

        }else{
            System.out.println("Please enter a string which has at least 3 characters");
        }







    }

}
