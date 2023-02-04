package com.linkedin.javacodechallenges;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static boolean isEven(int n){
        if(n%2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main( String[] args )
    {   Scanner scanner = new Scanner(System.in);

        System.out.println( "Enter a number: " );
        int userN = scanner.nextInt();
        System.out.println("Is the number even2?: " + isEven(userN));

        scanner.close();
    }
}
