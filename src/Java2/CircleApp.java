package Java2;

/**
 * Created by larryg on 5/17/17.
 */
public class CircleApp {

    public static void main(String[] args) {
        boolean anotherCircle;
        do {
            Input userInput = new Input();
            double circleRadius = userInput.getDouble("Please enter the radius of the circle you would like to create.");
            Circle circle1 = new Circle(circleRadius);
            System.out.printf("The area of your circle is %f and the circumference is %f", circle1.getArea(), circle1.getCircumference());
            anotherCircle = userInput.yesNo("Would you like to make another circle? y/n");
            circle1.circleCounter();
        if (!anotherCircle) {
            System.out.printf("\nYou created %d circles today.", circle1.getCircleCount());
        }
        }while(anotherCircle);

    }
}
