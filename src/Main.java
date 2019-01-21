import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        String u,p;
        double o,y,t;
        boolean Loop1,Loop2,Loop3;
        Square square = new Square(0);
        Rectangle rectangle = new Rectangle(0,0);
        Circle circle = new Circle("PlaceHolder",0);
        rightTriangle rightTriangle = new rightTriangle(0,0,0);

        Loop1 = true;
        Loop2 = false;
        Loop3 = true;
        while(Loop1) {
            System.out.println("Do you want to do a Square, Rectangle, Circle, or a RightTriangle?");
            u = scanner.next().toLowerCase();
            if (u.equals("square")) {
                System.out.println("What do you want the side lengths to be?");
                o = scanner.nextDouble();
                square.setSideLength(o);
                System.out.println("Square\n" + "Side Length: " + square.getSideLength() + "\nShape Perimeter: " + square.getPerimeter() + "\nShape Area: " + square.getArea() + "\n");
                Loop1 = false;
                Loop2 = true;
            }else if(u.equals("rectangle")){
                System.out.println("What do you want the side length a to be?");
                o = scanner.nextDouble();
                System.out.println("What do you want the side length b to be?");
                y = scanner.nextDouble();
                rectangle.setSideLengths(o,y);
                System.out.println("Rectangle\n"+"Sides Length: "+rectangle.getSideLengths()+"\nShape Perimeter: "+rectangle.getPerimeter()+"\nShape Area: "+rectangle.getArea()+"\n");
                Loop1 = false;
                Loop2 = true;
            }else if(u.equals("circle")){
                Loop1 = false;
                Loop3 = true;
                while(Loop3) {
                    System.out.println("Is it a radius or a diameter?");
                    u = scanner.next().toLowerCase();
                    if (u.equals("radius")) {
                        Loop1 = true;
                        Loop3 = false;
                        System.out.println("Enter the value of the radius.");
                    }else if(u.equals("diameter")){
                        Loop1 = true;
                        Loop3 = false;
                        System.out.println("Enter the value of the diameter.");
                    }else{
                        System.out.println("Invalid Response! Please enter Radius or Diameter.");
                    }
                }
                o = scanner.nextDouble();
                circle.setShapeLength(u,o);
                System.out.println("Circle\n"+"Shape Radius: "+circle.getRadius()+"\nShape Perimeter: "+circle.getPerimeter()+"\nShape Area: "+circle.getArea()+"\n");
                Loop1 = false;
                Loop2 = true;
            }else if(u.equals("righttriangle")){
                System.out.println("If you are missing a side, substitute it for 0!\nc cannot be bigger than a and/or b!\nWhat do you want the side length a to be?");
                o = scanner.nextInt();
                System.out.println("What do you want the side length b to be?");
                y = scanner.nextInt();
                System.out.println("What do you want the side length c to be?");
                t = scanner.nextInt();
                rightTriangle.setSideLengths(o,y,t);
                System.out.println("Right Triangle\n"+"Sides Length: "+rightTriangle.getSideLengths()+"\nShape Perimeter: "+rightTriangle.getPerimeter()+"\nShape Area: "+rightTriangle.getArea()+"\n");
                Loop1 = false;
                Loop2 = true;
            }else{
                System.out.println("Invalid Response! Please one of the responses!");
            }
            while(Loop2) {
                System.out.println("Do you want to enter another shape?");
                p = scanner2.nextLine().toLowerCase();
                if (p.equals("yes")) {
                    Loop1 = true;
                    Loop2 = false;
                } else if (p.equals("no")) {
                    Loop1 = false;
                    Loop2 = false;
                } else {
                    System.out.println("Invalid Response! Please enter Yes or No.");
                }
            }
        }

        /*
        Rectangle rectangle1 = new Rectangle(3,7);
        System.out.println("Rectangle 1\n"+"Sides Length: "+rectangle1.getSideLengths()+"\nShape Perimeter: "+rectangle1.getPerimeter()+"\nShape Area: "+rectangle1.getArea()+"\n");

        Circle circle1 = new Circle("diameter",7);
        System.out.println("Circle 1\n"+"Shape Radius: "+circle1.getRadius()+"\nShape Perimeter: "+circle1.getPerimeter()+"\nShape Area: "+circle1.getArea()+"\n");
        Circle circle2 = new Circle("radius",7);
        System.out.println("Circle 2\n"+"Shape Radius: "+circle2.getRadius()+"\nShape Perimeter: "+circle2.getPerimeter()+"\nShape Area: "+circle2.getArea()+"\n");

        Square square1 = new Square(3);
        System.out.println("Square 1\n"+"Side Length: "+square1.getSideLength() +"\nShape Perimeter: "+ square1.getPerimeter() +"\nShape Area: "+ square1.getArea()+"\n");
        Square square2 = new Square(6);
        System.out.println("Square 2\n"+"Side Length: "+square2.getSideLength() +"\nShape Perimeter: "+ square2.getPerimeter() +"\nShape Area: "+ square2.getArea()+"\n");

        rightTriangle rightTriangle1 = new rightTriangle(6,7,0);
        System.out.println("Right Triangle 1\n"+"Sides Length: "+rightTriangle1.getSideLengths()+"\nShape Perimeter: "+rightTriangle1.getPerimeter()+"\nShape Area: "+rightTriangle1.getArea()+"\n");
        rightTriangle rightTriangle2 = new rightTriangle(0,11,17);
        System.out.println("Right Triangle 2\n"+"Sides Length: "+rightTriangle2.getSideLengths()+"\nShape Perimeter: "+rightTriangle2.getPerimeter()+"\nShape Area: "+rightTriangle2.getArea()+"\n");
        */
    }
}
