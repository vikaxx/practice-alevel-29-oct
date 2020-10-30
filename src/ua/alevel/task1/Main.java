package ua.alevel.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        A object = new A();

        Class cl = object.getClass();
        Constructor<?> constructor = null;
        try {
            constructor = cl.getDeclaredConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            object = (A) constructor.newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        try {
            Field id = cl.getDeclaredField("id");
            id.setAccessible(true);
            id.set(object, 100);

            Field name = cl.getDeclaredField("name");
            name.setAccessible(true);
            name.set(object, "vika");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(object);
    }
}
