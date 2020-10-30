package ua.alevel.task4.figures.hierarchy;

import ua.alevel.task2.Value;
import ua.alevel.task3.Service;
import ua.alevel.task4.Init;

@Service
public class Ellipse implements Figure {
    private final double pi = Math.PI;
    private double bigFocus;
    private double smallFocus;

    @Value(value = "ellipse")
    String string;

    public double getPi() {
        return pi;
    }

    @Override
    public double area() {
        return pi * bigFocus * smallFocus;
    }

    @Override
    public double perimeter() {
        return 4 * (
                (pi * bigFocus * smallFocus + (bigFocus - smallFocus) * (bigFocus - smallFocus))
                        / (bigFocus + smallFocus));
    }

    @Init
    public void initFunc() {
        System.out.println("this is @init function is " + this.getClass().getSimpleName() + " class.");
    }
}
