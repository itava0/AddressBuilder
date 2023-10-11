package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following information: ");
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.print("Billing city: ");
        String billingCity = scanner.nextLine();

        System.out.print("Billing state: ");
        String billingState = scanner.nextLine();

        System.out.println("Billing zip: ");
        String billingZip = scanner.nextLine();

        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.print("Shipping city: ");
        String shippingCity = scanner.nextLine();

        System.out.print("Shipping state: ");
        String shippingState = scanner.nextLine();

        System.out.println("Shipping zip: ");
        String shippingZip = scanner.nextLine();

        System.out.println("Billing Address: ");
        StringBuilder billingAddress = new StringBuilder();
        billingAddress.append(billingStreet);
        billingAddress.append("\n");
        billingAddress.append(billingCity);
        billingAddress.append(", ");
        billingAddress.append(billingState);
        billingAddress.append(" ");
        billingAddress.append(billingZip);

        System.out.println(billingAddress);
        System.out.println("\n");

        System.out.println("Shipping Address: ");
        StringBuilder shippingAddress = new StringBuilder();
        shippingAddress.append(shippingStreet);
        shippingAddress.append("\n");
        shippingAddress.append(shippingCity);
        shippingAddress.append(", ");
        shippingAddress.append(shippingState);
        shippingAddress.append(" ");
        shippingAddress.append(shippingZip);

        System.out.println(shippingAddress);

    }
}
