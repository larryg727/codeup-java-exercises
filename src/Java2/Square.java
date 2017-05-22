package Java2;

/**
 * Created by larryg on 5/19/17.
 */
class Square extends Quadralateral {
    private double side;


    @Override
    void setLength(double side) {
        this.length = side;

    }

    @Override
    void setWidth(double side) {
        this.width = side;

    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public Square(double side){
        super(side, side);
        this.side = side;
    }
}
