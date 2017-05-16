package Java2;

import java.util.Scanner;

/**
 * Created by larryg on 5/16/17.
 */
public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String getString(){
        String input = scanner.nextLine();
        return input;
    }

}
