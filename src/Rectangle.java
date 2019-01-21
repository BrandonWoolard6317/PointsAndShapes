public class Rectangle {
    private double sideLengthA,sideLengthB;
    private double Perimeter,Area;

    public Rectangle(double sideLengthA,double sideLengthB){
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
        calcPerimeter();
        calcArea();
    }

    public void setSideLengths(double sideLengthA,double sideLengthB){
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
        calcPerimeter();
        calcArea();
    }

    private void calcPerimeter(){
        Perimeter = (sideLengthA*2)+(sideLengthB*2);
    }

    private void calcArea(){
        Area = (sideLengthA)*(sideLengthB);
    }

    public String getSideLengths(){
        return "a: "+sideLengthA+" b: "+sideLengthB;
    }

    public double getArea(){
        return Math.round(Area);
    }

    public double getPerimeter(){
        return Math.round(Perimeter);
    }
}
