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

        System.out.println("Enter the number you would like to go up to:");
        int upTo = scan.nextInt();
        scan.nextLine();   // take up extra enter from using nextInt
        System.out.println("Would you like to continue?(Y/N)");
        String cont = scan.nextLine();
        if (cont.equalsIgnoreCase("y")){
            System.out.println("OK, Here is your table then.");
            System.out.println("");
            System.out.println("");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for(i=1; i <= upTo; i++){
            int squared = i * i;
            int cubed = i * i * i;
            System.out.println("   " + i + "   |   " + squared + "     |   " + cubed + " ");

        }}else{
            System.out.println("Fine then.. Be that way ;)");
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
        System.out.println("Thank you, come again!");


    }
}
