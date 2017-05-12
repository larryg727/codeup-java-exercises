import java.util.Scanner;

/**
 * Created by larryg on 5/12/17.
 */
public class gameDev {

    public static int random() {
        int random = (int) (Math.random() * 100 + 1);
        return random;
    }


    public static int guess() {
        Scanner scan = new Scanner(System.in);
        int userGuess = scan.nextInt();
        return userGuess;
    }

    public static boolean compare(int random, int guess) {
        boolean gotItRight = false;
        if(random == guess){
            System.out.println("GOOD GUESS");
            gotItRight =  true;
        }else if(guess > random){
            System.out.println("LOWER");
        }else if(guess < random){
            System.out.println("HIGHER");
        }
        return gotItRight;
    }

    public static void main(String[] args) {
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        int random = random();
        int guess;
        boolean right = false;
        while(!right){
            guess = guess();
            right = compare(random, guess);

        }
    }

}