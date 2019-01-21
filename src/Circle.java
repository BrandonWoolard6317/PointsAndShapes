public class Circle {
    private double Radius;
    private double Perimeter,Area;

    public Circle(String radiusOrDiameter,double diameterOrRadius){
        if(radiusOrDiameter.equals("radius")){
            Radius = diameterOrRadius;
        } else if(radiusOrDiameter.equals("diameter")){
            Radius = diameterOrRadius/2;
        }
        calcPerimeter();
        calcArea();
    }

    public void setShapeLength(String radiusOrDiameter,double diameterOrRadius){
        if(radiusOrDiameter.equals("radius")){
            Radius = diameterOrRadius;
        } else if(radiusOrDiameter.equals("diameter")){
            Radius = diameterOrRadius/2;
        }
        calcPerimeter();
        calcArea();
    }

    public void calcPerimeter(){
        Perimeter = 2*Math.PI*Radius;
    }

    public void calcArea(){
        Area = Math.PI*(Math.pow(Radius,2));
    }

    public double getRadius(){
        return Radius;
    }

    public double getPerimeter(){
        return Math.round(Perimeter);
    }

    public double getArea(){
        return Math.round(Area);
    }
}
