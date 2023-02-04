package com.linkedin.javacodechallenges;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    // public static boolean isEven(int n){
    //     return n%2 == 0;
    // }
    public static boolean isPasswordComplex(String password){
        if(password.length()< 6){
            return false;
        }
        boolean hasLowercaseLetter = false;
        boolean hasUppercaseLetter = false;
        Boolean hasNunber = false;

        for(int i = 0; i < password.length() || !hasLowercaseLetter || !hasUppercaseLetter
        || !hasNunber; i++){
            char current = password.charAt(i);
            if(Character.isDigit(current)){
                hasNunber = true;
            }else if(Character.isUpperCase(current)){
                hasUppercaseLetter = true;
            }else if(Character.isLowerCase(current)){
                hasLowercaseLetter =  true;
            }
        }
        return hasLowercaseLetter && hasUppercaseLetter && hasNunber;
    }

    public static void main( String[] args )
    {   Scanner scanner = new Scanner(System.in);

        // System.out.println( "Enter a number: " );
        // int userN = scanner.nextInt();
        // System.out.println("Is the number even2?: " + isEven(userN));
        System.out.println("Enter a password: ");
        String userPassword = scanner.nextLine();
        System.out.println("Your password is strong? " + isPasswordComplex(userPassword));

        scanner.close();
    }
}
