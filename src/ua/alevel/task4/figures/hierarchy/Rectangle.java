package ua.alevel.task4.figures.hierarchy;

public class Rectangle implements Quadrangle {
    private double length;
    private double width;

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }
}
