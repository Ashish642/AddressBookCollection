package com.bridgelabz;
import  java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem  implements  Info {
    // ArrayList Declare
    ArrayList<Person> book = new ArrayList<>();
    // Creating scanner class object
    Scanner scanner = new Scanner(System.in);
    public void add() {
        // user input to print the details
        System.out.println("Enter rhe Firstname: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter the Lastname");
        String lastName = scanner.nextLine();
        System.out.println("Enter the Address: ");
        String address = scanner.nextLine();
        System.out.println("Enter the City :");
        String city = scanner.nextLine();
        System.out.println("Enter the PhoneNumber: ");
        long phoneNumber = scanner.nextLong();
        System.out.println("Enter the State: ");
        String state= scanner.nextLine();
        System.out.println("Enter the Zip code: ");
        String zip = scanner.nextLine();
        Person person = new Person(firstName,lastName,address,city,state,phoneNumber,zip);
        book.add(person);
        System.out.println("Successfully Add...");
    }

    // Display the persion details added
    public void display() {
        for (Person person : book)
            System.out.println(person);
    }
}
