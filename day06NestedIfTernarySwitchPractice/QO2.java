package day06NestedIfTernarySwitchPractice;

import java.util.Locale;
import java.util.Scanner;

public class QO2 {

    public static void main(String[] args) {

                    /*
            Ask user to enter his kid's name,
            if the name contains both "a" and "z"  output will be "This name contains 'a'"
            if the name contains "a"               output will be "This name contains 'a'."
            if the name contains "z"               output will be "This name contains 'z'."
            Otherwise, output will be             "This name contains neither 'a' nor 'z'."
            */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your kids name");
        String name = scan.nextLine().toLowerCase();

        if (name.contains("a") && name.contains("z")){
            System.out.println("This name contains 'a'");
        }else if (name.contains("a")){
            System.out.println("This name contains 'a'");
        }else if (name.contains("z") && name.contains("z")){
            System.out.println("This name contains 'z'");
        }else {
            System.out.println("This name contains neither 'a' nor 'z'.");
        }


    }
}
