package ua.alevel.task4.figures.hierarchy;

public abstract class Polygon implements Figure {
    @Override
    abstract public double area();

    @Override
    abstract public double perimeter();

    abstract public int insideCorner();

    abstract public int centerCorner();
}
