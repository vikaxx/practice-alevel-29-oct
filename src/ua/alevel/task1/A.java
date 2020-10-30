package ua.alevel.task1;

public class A {
    private String name;
    private int id;

    A() {
    }

    A(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
