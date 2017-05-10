import java.util.Scanner;

/**
 * Created by larryg on 5/9/17.
 */
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int i = 5;
        while(i <= 15){
            System.out.println(i);
            i++;
        }

        i = 0;
        do{
            i++;
            if(i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }while(i <100);
        System.out.println(i);
        do{
            i -= 5;
            System.out.println(i);
        }while(i > -10);

        long  x;
        for(x=2; x <= 1000000; x *=x){
            System.out.println(x);
        }

        for(i=1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }


        String cont = "Y";
        while (cont.equalsIgnoreCase("y")) {
            System.out.println("Enter the number you would like to go up to:");
            int upTo = scan.nextInt();
            scan.nextLine();   // take up extra enter from using nextInt

            System.out.println("OK, Here is your table.");
            System.out.println("");
            System.out.println("");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (i = 1; i <= upTo; i++) {
                int squared = i * i;
                int cubed = i * i * i;
                System.out.println("   " + i + "   |   " + squared + "     |   " + cubed + " ");

            }
            System.out.println("Would you like to try another? Y/N");
            cont = scan.nextLine();
        }

        String contGrade = "y";
        while (contGrade.equalsIgnoreCase("y")){
            System.out.println("Please enter a numerical grade:");
            int grade = scan.nextInt();
           if(grade <=100 && grade>=88){
               System.out.println("You have an A!");
        }else if(grade <=87 && grade>=80) {
            System.out.println("You have a B.");
        }else if(grade <=79 && grade>=67){
               System.out.println("You have a C.");
           }else if(grade <=66 && grade>=60){
               System.out.println("You have a D.");
           }else{
               System.out.println("You hava a F. :(");
           }
            System.out.println("Would you like to check another grade? Y/N");
           contGrade = scan.next();
        }



        String contRain = "Y";
        while(contRain.equalsIgnoreCase("y")) {
            System.out.println("Enter a number to convert it to raindrop:");
            int rainInput = scan.nextInt();
            String rainString = rainInput + "'s factors are ";

            for (i = 1; i <= rainInput; i++) {
                if (rainInput == i) {
                    rainString += i + ".";
                } else if (rainInput % i == 0) {
                    rainString += i + " ,";
                }
            }
            System.out.println(rainString);
            String rainSpeak = " In raindrop-speak, this would be a ";
            if (rainString.indexOf("3") != -1) {
                rainSpeak += "Pling";
            }
            if (rainString.indexOf("5") != -1) {
                rainSpeak += "Plang";
            }
            if (rainString.indexOf("7") != -1) {
                rainSpeak += "Plong";
            }
            if (rainString.indexOf("3") != -1 || rainString.indexOf("5") != -1 || rainString.indexOf("7") != -1){
                System.out.println(rainSpeak);
            }
            System.out.println("Would you like to try another number? Y/N");
            contRain = scan.next();
        }

        int avg = 0;
        int lowestGrade = 100;
        System.out.println("Please enter the 10 students grades :");
        int[] grades = new int[10];
        for(i=0; i < 10; i++){
            grades[i] = scan.nextInt();
            avg += grades[i];
            if(grades[i] < lowestGrade){
                lowestGrade = grades[i];
            }
        }
        System.out.println("The average grade was: " + (avg/10));
        System.out.println("The lowest grade was " + lowestGrade);

        System.out.println("Thank you, come again!");
    }
}
