package com.bridgelabz;

import java.util.Scanner;

public class Main {
    private void option() {
        boolean status = true;
        Scanner scanner = new Scanner(System.in);
        // create object
        AddressBookSystem addressBookSystem = new AddressBookSystem();

        /*
         * To print option to perform choice  to print add and display method
         */
        while (status) {
            System.out.println("Enter your option :  \n Press 1 to Add new person " +
                    "            + \n Press 2 to display details \n Press 9 to Quit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                       addressBookSystem.add();
                       break;
                case 2:
                    System.out.println("Enter the firstname to egit your details");
                    String firstName = scanner.next();
                    addressBookSystem.edit(firstName);
                       break;
                case 3:
                        addressBookSystem.display();
                        break;

                case 4:
                    System.out.println("Enter your firstname to delete your details");
                    String firstname = scanner.next();
                    addressBookSystem.delete(firstname);
                    break;
                default:
                        status = false;
            }
        }

    }
    /* Main method to call option */
    public static void main(String[] args) {
        Main main = new Main();
        main.option();
    }
}
