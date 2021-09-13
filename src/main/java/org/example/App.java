/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###");

        //input
        System.out.println("Press C to convert from Fahrenheit to Celsius. \nPress F to convert from Celsius to Fahrenheit. \nYour choice:" );
        String input = scan.nextLine();

        //processing and output
        if (input.equals("F") || input.equals("f"))
        {
            System.out.print("Please enter the temperature in Celsius: ");
            double celsius = scan.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " +df.format(fahrenheit) + ".");
        }
        if (input.equals("C") || input.equals("c"))
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            double fahrenheit = scan.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " +df.format(celsius) + ".");
        }
    }
}
