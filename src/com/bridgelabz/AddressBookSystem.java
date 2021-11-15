package com.bridgelabz;

public class AddressBookSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book collection program");
        Person person = new Person("Ashish" , "kumar", "Allahabad,UP", "Allahabad", "UP", "221104","9453627297");
        System.out.println("FirstName:"+ person.getFirstName());
        System.out.println("LastName:"+ person.getLastName());
        System.out.println("Address:"+ person.getAddress());
        System.out.println("City:"+ person.getCity());
        System.out.println("State:"+ person.getState());
        System.out.println("PhoneNumber:"+ person.getPhoneNumber());
        System.out.println("Zip:"+ person.getZip());

    }
}
