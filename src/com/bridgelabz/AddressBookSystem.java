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
    /* Method to edit or update the details using firstname */

    public void edit(String firstName) {
        for (int search = 0; search < book.size(); search++) {

            if (book.get(search).getFirstName().equalsIgnoreCase(firstName)) {
                Person person = book.get(search);
                System.out.println("Hey  " + person.getFirstName() + " Please edit your details");
                System.out.println("Hey " + person.getFirstName() + " Please edit your address");
                scanner.next();
                String address = scanner.nextLine();
                person.setAddress(address);
                System.out.println("Hey  " + person.getFirstName() + " Please edit your city");
                String city = scanner.next();
                person.setCity(city);
                System.out.println("Hey " + person.getFirstName() + " Please edit your state");
                String state = scanner.next();
                person.setState(state);
                System.out.println("Hey " + person.getFirstName() + " Please edit your phone number");
                long phone = scanner.nextLong();
                person.setPhoneNumber(phone);
                System.out.println("Hey " + person.getFirstName() + " Please edit your zip");
                scanner.nextLine();
                String zip = scanner.nextLine();
                person.setZip(zip);
                System.out.println("Hey " + person.getFirstName() + " Successfully you have updated your details. ");
            }
        }

    }



        // Display the persion details added
    public void display() {
        for (Person person : book)
            System.out.println(person);
    }
}

