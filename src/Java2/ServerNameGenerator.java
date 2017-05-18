package Java2;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by larryg on 5/18/17.
 */
public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives = {"Astounding", "Clunky", "Slippery", "Gentle", "Harsh", "Crunchy", "Short", "Angry", "Dry", "Smooth"};
        String[] nouns = {"Shoes", "Saxophone", "Library", "Knob", "Sheet", "Hair", "Couch", "Office", "Socks", "Computer"};
        boolean another = true;

        Input userInput = new Input();

        userInput.getString("Welcome to my random server name generator!\n Press enter to start.");
        do{
            System.out.println(randomGenerator(adjectives) + " " + randomGenerator(nouns));
            System.out.println(
            );
            another = userInput.yesNo("Would you like to generate another? y/n");
        }while(another);


    }

    public static String randomGenerator (String[] word){
        int random =(int)(Math.random() * word.length);
        return word[random];
    }

}

