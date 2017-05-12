
import java.util.Scanner;

/**
 * Created by larryg on 5/12/17.
 */
public class diceRoll {

    public static void dice(){
        Scanner scan = new Scanner(System.in);
        String again = "y";
        while(again.equalsIgnoreCase("y")){
        System.out.println("Please enter the number of sides on your dice.");
        int sides = scan.nextInt();
        System.out.println("Enter 'roll' when you ready to roll the dice. ");
        String roll = scan.next();
        if(roll.equalsIgnoreCase("roll")) {
            int dice1 = (int) (Math.random() * sides + 1);
            int dice2 = (int) (Math.random() * sides + 1);
            System.out.printf(" Dice1   Dice2\n _____   _____\n|     | |     |\n|  %-3s| |  %-3s|\n|_____| |_____|\n", dice1, dice2);
        }
            System.out.println("Do you want to try again? y/n");
        again = scan.next();
        }
    }

    public static void main(String[] args) {
        dice();
    }

}
