package Java2;

/**
 * Created by larryg on 5/19/17.
 */
class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getArea2(){
        return side * side;
    }

    public double getPerimeter2(){
        return side * 4;
    }


}
