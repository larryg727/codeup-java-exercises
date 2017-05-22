package Java2;

/**
 * Created by larryg on 5/19/17.
 */
public class Rectangle extends Quadralateral{


    @Override
    public double getPerimeter() {
        return ((2 * length) + (2 * width));
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    void setLength(double length) {
        this.length = length;
    }


    @Override
    void setWidth(double width) {
        this.width = width;

    }


    public Rectangle(double length, double width){
        super(length, width);
    }

}


