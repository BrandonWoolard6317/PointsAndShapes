public class Square {
    private double sideLength;
    private double perimeter;
    private double area;

    public Square(double lengthOfSide){
        sideLength = lengthOfSide;
        calcPerimeter();
        calcArea();
    }

    private void calcPerimeter(){
        perimeter = sideLength *4;
    }

    private void calcArea(){
        area = sideLength * sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
        calcArea();
        calcPerimeter();
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }
}