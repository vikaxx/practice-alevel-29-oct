package ua.alevel.task2;

public class MyClass {
    @Value("initialize")
    public String string;

    @Override
    public String toString() {
        return "MyClass{" +
                "string='" + string + '\'' +
                '}';
    }
}
