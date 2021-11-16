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


        for (Person value : book) {
            if (value.getFirstName().equalsIgnoreCase(firstName)) {
                if (value.getLastName().equalsIgnoreCase(lastName)) {
                    System.out.println("Name is already exist please update/edit your details with option 2");
                    return;
                }

            }

        }

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
        for (Person value : book) {

            if (value.getFirstName().equalsIgnoreCase(firstName)) {
                System.out.println("Hey  " + value.getFirstName() + " Please edit your details");
                System.out.println("Hey " + value.getFirstName() + " Please edit your address");
                scanner.next();
                String address = scanner.nextLine();
                value.setAddress(address);
                System.out.println("Hey  " + value.getFirstName() + " Please edit your city");
                String city = scanner.next();
                value.setCity(city);
                System.out.println("Hey " + value.getFirstName() + " Please edit your state");
                String state = scanner.next();
                value.setState(state);
                System.out.println("Hey " + value.getFirstName() + " Please edit your phone number");
                long phone = scanner.nextLong();
                value.setPhoneNumber(phone);
                System.out.println("Hey " + value.getFirstName() + " Please edit your zip");
                scanner.nextLine();
                String zip = scanner.nextLine();
                value.setZip(zip);
                System.out.println("Hey " + value.getFirstName() + " Successfully you have updated your details. ");
            }
        }

    }
    /* Method to delete the details using firstname */
    public void delete(String firstName) {
        for (int select = 0; select < book.size(); select++) {
            if (book.get(select).getFirstName().equalsIgnoreCase(firstName)) {
                Person person = book.get(select);
                book.remove(person);
                System.out.println("Successfully Deleted!");
            }
        }
    }



        // Display the person details added
    public void display() {
        for (Person person : book)
            System.out.println(person);
    }
}

