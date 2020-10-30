package ua.alevel.task4.figures.hierarchy;

import ua.alevel.task2.Value;
import ua.alevel.task3.Service;
import ua.alevel.task4.Init;

@Service
public class Circle extends Ellipse {
    private final double pi = super.getPi();
    private double radius;

    @Value(value = "circle")
    String string;

    public double getPi() {
        return pi;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    public double diameter() {
        return radius * 2;
    }

    @Init
    public void initFunc() {
        System.out.println("this is @init function is " + this.getClass().getSimpleName() + " class.");
    }
}
