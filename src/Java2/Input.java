package Java2;

import java.util.Scanner;

/**
 * Created by larryg on 5/16/17.
 */
public class Input {

    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString(){
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max){
        int userInput;
        try {
            userInput = Integer.valueOf(scanner.nextLine());

        if(userInput >= min && userInput <= max){
            return userInput;
        }else {
            System.out.printf("Please make sure your number is between  %d and %d.\n", min, max);
            return getInt(min, max);
        }
        } catch (NumberFormatException e){
            System.out.println("Opps, please try again using only numbers");
            return getInt(min, max);
        }
    }

    public int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        int userInput;
        try {
            userInput = Integer.valueOf(scanner.nextLine());

        if(userInput >= min && userInput <= max){
            return userInput;
        }else {
            System.out.printf("Please make sure your number is between  %d and %d.\n", min, max);
            return getInt(min, max);
        }
        } catch (NumberFormatException e){
            System.out.println("Opps, please try again using only numbers");
            return getInt(min, max, prompt);
        }
    }

    public int getInt(){
        try {
           return Integer.valueOf(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Opps, please try again using only numbers");
            return getInt();
        }
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        try {
            return Integer.valueOf(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Opps, please try again using only numbers");
            return getInt(prompt);
        }
    }

    public double getDouble(double min, double max) {
        double userInput;
        try {
            userInput = Double.valueOf(scanner.nextLine());

        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.printf("Please make sure your number is between  %f and %f.\n", min, max);
            return getDouble(min, max);
        }
        } catch (NumberFormatException e){
            System.out.println("Opps, please try again using only numbers");
            return getDouble(min, max);
        }
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        double userInput;
        try {
            userInput = Double.valueOf(scanner.nextLine());

        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.printf("Please make sure your number is between  %f and %f.\n", min, max);
            return getDouble(min, max);
        }
        } catch (NumberFormatException e){
            System.out.println("Opps, please try again using only numbers");
            return getDouble(min, max, prompt);
        }
    }

        public double getDouble(){
            try {
                return Double.valueOf(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Opps, please try again using only numbers");
                return getDouble();
            }
    }


    public double getDouble(String prompt){
        System.out.println(prompt);
        try {
            return Double.valueOf(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Opps, please try again using only numbers");
            return getDouble(prompt);
        }
    }



}
