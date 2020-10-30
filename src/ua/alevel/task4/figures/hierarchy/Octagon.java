package ua.alevel.task4.figures.hierarchy;

import ua.alevel.task2.Value;
import ua.alevel.task3.Service;
import ua.alevel.task4.Init;

@Service
public class Octagon extends Polygon {
    private double side;

    @Value(value = "octagon")
    String string;

    public double getSide() {
        return side;
    }

    @Override
    public double area() {
        return 2 * side * side * (1 + Math.sqrt(2));
    }

    @Override
    public double perimeter() {
        return side * 8;
    }

    @Override
    public int insideCorner() {
        return (180*(8-2))/(8);
    }

    @Override
    public int centerCorner() {
        return 360/8;
    }

    @Init
    public void initFunc() {
        System.out.println("this is @init function is " + this.getClass().getSimpleName() + " class.");
    }
}
