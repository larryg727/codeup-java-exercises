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
        if (sizeSelect == "small") {
            priceTotal = smallPrice;
        }else if (sizeSelect == "medium"){
            priceTotal = mediumPrice;
        }else if (sizeSelect == "large") {
            priceTotal = largePrice;
        }else {
            System.out.println("Please enter a valid size.");
            sizeSelect = scan.nextLine();
        }
        System.out.println("You have selceted the " + sizeSelect + " for $" + priceTotal);
    }
}
