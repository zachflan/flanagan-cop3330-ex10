/*
 *  UCF COP3330 Summer 2021 Assignment 10 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner item1 = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        String item1S = item1.nextLine();
        int item1I = Integer.parseInt(item1S);

        Scanner quantity1 = new Scanner(System.in);
        System.out.print("Enter the quantity of item 1: ");
        String quantity1S = quantity1.nextLine();
        int quantity1I = Integer.parseInt(quantity1S);

        int totalItem1 = item1I * quantity1I;

        Scanner item2 = new Scanner(System.in);
        System.out.print("Enter the price of item 2: ");
        String item2S = item2.nextLine();
        int item2I = Integer.parseInt(item2S);

        Scanner quantity2 = new Scanner(System.in);
        System.out.print("Enter the quantity of item 2: ");
        String quantity2S = quantity2.nextLine();
        int quantity2I = Integer.parseInt(quantity2S);

        int totalItem2 = item2I * quantity2I;

        Scanner item3 = new Scanner(System.in);
        System.out.print("Enter the price of item 3: ");
        String item3S = item3.nextLine();
        int item3I = Integer.parseInt(item3S);

        Scanner quantity3 = new Scanner(System.in);
        System.out.print("Enter the quantity of item 3: ");
        String quantity3S = quantity3.nextLine();
        int quantity3I = Integer.parseInt(quantity3S);

        int totalItem3 = item3I * quantity3I;

        float totalPreTax = totalItem1 + totalItem2 + totalItem3;
        double tax = totalPreTax * 0.055;
        double totalPrice = totalPreTax + tax;

        System.out.format("Subtotal: $%.2f\n", totalPreTax);

        System.out.format("Tax: $%.2f\n", tax);

        System.out.format("Total: $%.2f\n", totalPrice);

    }
}