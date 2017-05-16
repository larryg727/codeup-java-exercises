package Java1;

import java.util.Scanner;

/**
 * Created by larryg on 5/12/17.
 */
public class averageMethods {

    public static int input(){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        return input;
    }

    public static int howMany(){
        System.out.println("How many numbers do you want to average?");
        int amount = input();
        return amount;
    }

    public static void average(){
        int number = howMany();
        int average = 0;
        System.out.println("Please enter your " + number + " numbers to average.");
        for(int i= 0; i < number; i++){
            average += input();
        }
        average = average / number;
        System.out.println("The average value is " + average);
    }

    public static void main(String[] args) {
        average();
    }

}
