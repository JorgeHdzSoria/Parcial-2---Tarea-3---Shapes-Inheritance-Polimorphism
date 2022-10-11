package shapes;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public String getName() {
        return "Triangle";
    }

    public int getSidesCount() {
        return 3;
    }

    public float getPerimeter() {
        float a = base+height*2;
        return a;
    }

    public double getArea() {
        double a = (height*base)/2;
        return a;
    }

}