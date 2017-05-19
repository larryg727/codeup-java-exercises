package Java2;

/**
 * Created by larryg on 5/19/17.
 */
public class Rectangle {

    private double length;
    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return ((2 * this.length) + (2 * this.width));
    }

}


