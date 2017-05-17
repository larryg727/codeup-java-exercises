package Java2;

/**
 * Created by larryg on 5/17/17.
 */
public class Circle {

    private double radius;
    private static int circleCount = 0;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
       return (Math.PI * (radius * radius));
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public int getCircleCount(){
        return circleCount;
    }

    public void setCircleCount(int circleCount){
        Circle.circleCount = circleCount;
    }

    public void circleCounter(){
         setCircleCount(getCircleCount() + 1);
    }



}
