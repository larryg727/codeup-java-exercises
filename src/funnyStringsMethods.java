import java.util.Scanner;

/**
 * Created by larryg on 5/12/17.
 */
public class funnyStringsMethods {

    public static String inputString(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word or phrase of 10 characters or more. Spaces count.");
        String input = scan.nextLine();
        if(input.length() < 10){
            System.out.println("Please enter a word or word at LEAST 10 characters long.(spaces count)");
            input = scan.nextLine();
        }
        return input;
    }

    public static int inputNumber(){
        System.out.println("Please enter a number between 1 and 5");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if (input < 0 || input > 5){
            System.out.println("Please keep it between 1 and 5");
            input= scan.nextInt();
        }
        return input;
    }

    public static String funny(int number, String input){
        StringBuilder updated = new StringBuilder(input.length());
        updated.append(input);
        for (int i = 1; i <= input.length(); i++){
            if(i % number == 0){
                char temp, tempOpp;
                 temp = input.charAt(i-1);
                if (temp == Character.toUpperCase(temp)){
                    tempOpp = Character.toLowerCase(temp);
                }else{
                   tempOpp = Character.toUpperCase(temp);
                }
               updated.delete(i-1, i);
                updated.insert(i-1, tempOpp);
            }
        }
        input = updated.toString();
        return input;
    }

    public static void main(String[] args) {
        System.out.println(funny(inputNumber(), inputString()));
    }


}
