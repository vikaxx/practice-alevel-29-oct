package ua.alevel.task4.figures.hierarchy;

public class Triangle implements Figure {
    private double leftSide;
    private double rightSide;
    private double downSide;

    @Override
    public double area() {
        double p = halfPerimeter();
        return Math.sqrt(p * (p - leftSide) * (p - rightSide) * (p - downSide));
    }

    @Override
    public double perimeter() {
        return leftSide + rightSide + downSide;
    }

    private double halfPerimeter() {
        return perimeter() / 2;
    }

    public double middleLine() {
        return downSide / 2;
    }

    public double height() {
        return (2 * area()) / downSide;
    }
}
