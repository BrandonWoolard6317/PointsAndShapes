public class Point {
    private int x,y,z;
    private static int PointNumber = 0;
    private int pointValue;


    public Point() {
        this(0);
    }

    public Point(int x) {
        this(x,0);

    }

    public Point(int x, int y) {
        this(x,y,0);

    }

    public Point(int x, int y, int z) {
        pointValue = ++PointNumber;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void translate(int xMove, int yMove, int zMove) {
        this.x += xMove;
        this.y += yMove;
        this.z += zMove;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public static int getPointNumber() {
        return PointNumber;
    }

    @Override
    public String toString() {
        return "Point "+pointValue+": "+"("+x+","+y+","+z+")";
    }

}