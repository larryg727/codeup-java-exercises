/**
 * Created by larryg on 5/11/17.
 */
public class methodsExercise {

    public static int addition(int x, int y){
        return x + y;
    }

    public static int subtraction(int x, int y){
        return x - y;
    }

    public static int multiplication(int x, int y){
        return x * y;
    }

    public static int division(int x, int y){
        return x / y;
    }
    public static int modulus(int x, int y){
        return x % y;
    }

    public static int multiplicationNoStar(int x, int y){
            int answer = 0;
        for(int i = 0; i < x; i++){
            answer += y;
        }return answer;
    }

    public static int multiplicationNoStarRecursion(int x, int y) {


        if (0 <= x) {
            x--;
        y += y;
        multiplicationNoStarRecursion(x, y);
        }
        return y;
    }

    public static void main(String[] args) {

        System.out.println(addition(5,7));
        System.out.println(subtraction(15, 3));
        System.out.println(multiplication(3,4));
        System.out.println(division(24,2));
        System.out.println(modulus(12,3));
        System.out.println(multiplicationNoStar(8,5));
        System.out.println(multiplicationNoStarRecursion(3,5));
    }
}
