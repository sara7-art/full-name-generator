package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String [] args) {

       Scanner scanner = new Scanner(System.in);
       //Ask user full name//
       System.out.print("Enter your first name: ");
       String firstName = scanner.nextLine();

       // full name string being declared
       String fullName = firstName;
       System.out.println(firstName);

       //user enters middle name
       System.out.println("Enter Middle name");
       String middleName = scanner.nextLine();

       // updating string method with middle name
       if (!middleName.isEmpty())
          fullName += " " + middleName;

       // user enter last name
       System.out.print("Enter last name");
       String lastName = scanner.nextLine();

       fullName += " " + lastName;

       System.out.print("Full name: "+ fullName);


    }

}
