package Java2;

/**
 * Created by larryg on 5/19/17.
 */
public class ShapesTest {
    public static void main(String[] args) {

    Measurable myShape = new Square(5);

        System.out.println("Square area is : " + myShape.getArea());
        System.out.println("Square perimeter is :" + myShape.getPerimeter());

        Measurable myShape2 = new Rectangle(8,5);

        System.out.println("Rectangle area is : " + myShape2.getArea());
        System.out.println("Rectangle perimeter is :" + myShape2.getPerimeter());


    }
}
