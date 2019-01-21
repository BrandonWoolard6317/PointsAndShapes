public class rightTriangle {
    private double lengthOfSideA,lengthOfSideB,lengthOfSideC;
    private double Area,Perimeter;

    public rightTriangle(double lengthOfSideA,double lengthOfSideB, double lengthOfSideC){
        this.lengthOfSideA = lengthOfSideA;
        this.lengthOfSideB = lengthOfSideB;
        this.lengthOfSideC = lengthOfSideC;
        findMissingLength();
        calcPerimeter();
        calcArea();
    }

    public void setSideLengths(double lengthOfSideA,double lengthOfSideB, double lengthOfSideC){
        this.lengthOfSideA = lengthOfSideA;
        this.lengthOfSideB = lengthOfSideB;
        this.lengthOfSideC = lengthOfSideC;
        findMissingLength();
        calcPerimeter();
        calcArea();
    }

    private void findMissingLength(){
        if(lengthOfSideA==0){
            lengthOfSideA = (Math.sqrt((Math.pow(lengthOfSideC,2))-(Math.pow(lengthOfSideB,2))));
        }else if(lengthOfSideB==0){
            lengthOfSideB = Math.sqrt(Math.pow(lengthOfSideC,2)-Math.pow(lengthOfSideA,2));
        }else if(lengthOfSideC==0){
            lengthOfSideC = Math.sqrt(Math.pow(lengthOfSideA,2)+Math.pow(lengthOfSideB,2));
        }
    }

    private void calcPerimeter(){
        Perimeter = lengthOfSideA+lengthOfSideB+lengthOfSideC;
    }

    private void calcArea(){
        Area = (lengthOfSideA*lengthOfSideB*lengthOfSideC);
    }

    public String getSideLengths(){
        return "a: "+Math.round(lengthOfSideA)+" b: "+Math.round(lengthOfSideB)+" c: "+Math.round(lengthOfSideC);
    }

    public double getPerimeter(){
        return Math.round(Perimeter);
    }

    public double getArea(){
        return Math.round(Area);
    }
}
