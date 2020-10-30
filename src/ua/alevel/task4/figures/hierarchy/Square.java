package ua.alevel.task4.figures.hierarchy;

import ua.alevel.task2.Value;
import ua.alevel.task3.Service;
import ua.alevel.task4.Init;

@Service
public class Square extends Rectangle {
    private double side;

    @Value(value = "square")
    String string;

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public double diagonal() {
        return Math.sqrt(2 * (Math.pow(side, 2)));
    }

    @Init
    public void initFunc() {
        System.out.println("this is @init function is " + this.getClass().getSimpleName() + " class.");
    }
}
