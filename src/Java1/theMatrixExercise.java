package Java1;

import java.util.Scanner;

/**
 * Created by larryg on 5/12/17.
 */
public class theMatrixExercise {

    public static int input(){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        return input;
    }

    public static int number(){
        System.out.println("Enter a number to enter the matrix");
        int numberInput = input();
        return numberInput;
    }

    public static int randomMatrix(){
        int random =(int)(Math.random()* 2);
        return random;
    }

    public static void matrix(int number){
        String matrix = "";
        for(int i = 0; i < number; i++){
            for(int x = 1; x <= number; x++){
                if(x == number){
                    matrix += randomMatrix() + "\n";
                }else {
                    matrix += randomMatrix() + " ";
                }
            }
        }

        System.out.println(matrix);
    }

    public static void main(String[] args) {
        int number = number();
        matrix(number);
    }

}
