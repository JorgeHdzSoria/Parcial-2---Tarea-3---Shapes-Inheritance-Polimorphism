package shapes;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public String getName() {
        return "Square";
    }

    public float getPerimeter() {
        return side * 4;
    }
    public int getSidesCount() {
        return 4;
    }


    public double getArea() {
        double a = side*side;
        return a;
    }

}