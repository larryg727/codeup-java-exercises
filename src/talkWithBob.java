import java.util.Scanner;

/**
 * Created by larryg on 5/11/17.
 */
public class talkWithBob {
    public static void main(String[] args) {
        String bye = "false";
            System.out.println("Sup... I'm Bob...");
        while(bye.equals("false")) {
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            if (input.endsWith("?")) {
                System.out.println("Sure");
            } else if (input.trim().equals("")) {
                System.out.println("Fine. Be that way!");
            } else if (input.toUpperCase().equals(input)) {
                System.out.println("Whoa, chill out");
            } else if (input.toLowerCase().contains("bye")) {
                bye = "true";
                System.out.println("Peace man");
            }else if(input.toLowerCase().contains("i'm") || input.toLowerCase().contains("im") || input.toLowerCase().contains("i am")){
                String name = input.substring(input.indexOf('m') + 2, input.length());
                System.out.println("Hey " + name);
            }else if(input.toLowerCase().contains("where")){
                System.out.println("Everywhere and anywhere.");
            }else if(input.toLowerCase().contains("how")){
                System.out.println("IDK");
            }else if(input.toLowerCase().contains("why")){
                System.out.println("You ask a lot of questions");
            }
            else {
                System.out.println("Whatever");
            }
        }

    }
}
