package ua.alevel.task4.figures.hierarchy;

public class Hexagon extends Polygon {
    private double side;

    public double getSide() {
        return side;
    }

    @Override
    public double area() {
        return (3*Math.sqrt(3)*side*side)/2;
    }

    @Override
    public double perimeter() {
        return side*6;
    }

    @Override
    public int insideCorner() {
        return (180*(6-2))/(6);
    }

    @Override
    public int centerCorner() {
        return 360/6;
    }
}
