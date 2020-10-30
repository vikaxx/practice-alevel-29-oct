package ua.alevel.task4.figures.hierarchy;

public class Pentagon extends Polygon {
    private double side;

    public double getSide() {
        return side;
    }

    @Override
    public double area() {
        return side*side*((Math.sqrt(25+10*Math.sqrt(5)))/4);
    }

    @Override
    public double perimeter() {
        return 5*side;
    }

    @Override
    public int insideCorner() {
        return (180*(5-2))/(5);
    }

    @Override
    public int centerCorner() {
        return 360/5;
    }
}
