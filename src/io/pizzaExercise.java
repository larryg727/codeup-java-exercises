package io;

import java.util.Scanner;

/**
 * Created by larryg on 5/8/17.
 */
public class pizzaExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double smallPrice = 7.95;
        double mediumPrice = 9.95;
        double largePrice = 11.95;
        System.out.println("Hello what size pizza would you like? We have small for $" + smallPrice + ", medium for $" + mediumPrice + ", and large for $" + largePrice);
        String sizeSelect = scan.nextLine();
        double priceTotal = 0;
        if (sizeSelect.equalsIgnoreCase("small")) {
            priceTotal = smallPrice;
        }else if (sizeSelect.equalsIgnoreCase("medium")){
            priceTotal = mediumPrice;
        }else if (sizeSelect.equalsIgnoreCase("large")) {
            priceTotal = largePrice;
        }else {
            System.out.println("Please enter a valid size.");
            sizeSelect = scan.nextLine();
        }
        System.out.println("You have selceted the " + sizeSelect + " for $" + priceTotal + "\n");

        System.out.println("Please choose a type. We have: regular, pan, square, stuffed crust(+$2.00), and pretzel(+$3.00");
        String type = scan.next();
        if(type.equalsIgnoreCase("stuffed")){
            priceTotal += 2.00;
            System.out.println("Current total: " + priceTotal);
        }else if(type.equalsIgnoreCase("pretzel")){
            priceTotal += 3.00;
            System.out.println("Current total: " + priceTotal);
        }
        System.out.println("\nPlease enter the toppings you would you like.(max 10)\n After the first they are $1.50/each. When done ordering enter done.");
        String orderComplete = "ordering";
        int i = 0;
        String[] toppings = new String[10];
        while(orderComplete.equalsIgnoreCase("ordering")){
        String topIn = scan.next();
        if(topIn.equalsIgnoreCase("done")){
            orderComplete = "done";
        }else {
            toppings[i] = topIn;
            i++;
        }
        }
        System.out.println(priceTotal);
        priceTotal += ((i-1) * 1.50);
        System.out.println(priceTotal);

    }
}
