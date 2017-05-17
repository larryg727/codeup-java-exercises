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
        String userInput = scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String userInput = scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max){
        int userInput = scanner.nextInt();
        if(userInput >= min && userInput <= max){
            return userInput;
        }else {
            System.out.printf("Please make sure your number is between  %d and %d.\n", min, max);
            return getInt(min, max);
        }
    }

    public int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        if(userInput >= min && userInput <= max){
            return userInput;
        }else {
            System.out.printf("Please make sure your number is between  %d and %d.\n", min, max);
            return getInt(min, max);
        }
    }

    public int getInt(){
        return scanner.nextInt();
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double userInput = scanner.nextDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.printf("Please make sure your number is between  %f and %f.\n", min, max);
            return getDouble(min, max);
        }
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        double userInput = scanner.nextDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.printf("Please make sure your number is between  %f and %f.\n", min, max);
            return getDouble(min, max);
        }
    }

        public double getDouble(){
            return scanner.nextDouble();
    }


    public double getDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }



}
