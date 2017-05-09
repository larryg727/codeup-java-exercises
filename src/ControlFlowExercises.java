/**
 * Created by larryg on 5/9/17.
 */
public class ControlFlowExercises {
    public static void main(String[] args) {
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


//        for(i=2; i < 10000; i *=i){
//            System.out.println(i);
//        }

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
    }
}
