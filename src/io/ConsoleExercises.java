package io;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by larryg on 5/8/17.
 */
public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        PrintStream output = System.out;
        String firstFavorite;
        String secondFavorite;
        String thirdFavorite;
        String quote;
        int favorite;
        double length;
        double width;
        double height;

        output.println("Please enter your favorite number.");
        favorite = sc.nextInt();
        output.println("You entered: " + favorite);

        output.println("Please enter your three favorite foods.");

        firstFavorite = sc.next();
        secondFavorite = sc.next();
        thirdFavorite = sc.next();

        output.println("Your favorite foods are : " + firstFavorite + ", " + secondFavorite + ", and " + thirdFavorite);

        sc.nextLine();   // get rid of extra "enter"

        output.println("Please enter your favorite Terminator quote.");
        quote = sc.nextLine();
        output.println(quote);

        output.println("What is the length of the Codeup Big Classroom");
        length = sc.nextDouble();

        output.println("What is the width of the  Codeup Big Classroom");
        width = sc.nextDouble();

        output.println("What is the height of the Codeup Big Classroom");
        height = sc.nextDouble();

        output.println("The area of the class room is " + length * width + " square feet");
        output.println("The perimeter of the class room is " + ((2*length)+(2*width)) + " feet");
        output.println("The volume of the class room is " + length * width * height + " cubic feet.");

    }
}
