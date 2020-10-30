package ua.alevel.task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class OnlyFieldsAnnotation {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        MyClass obj = new MyClass();

        Class cl = obj.getClass();
        Constructor<?> constructor = cl.getDeclaredConstructor();
        obj = (MyClass) constructor.newInstance();
        Field field = cl.getDeclaredField("string");

        Value annotation = field.getAnnotation(Value.class);
        if (annotation != null) {
            String defaultValue = annotation.value();
            Field string = cl.getDeclaredField("string");
            string.setAccessible(true);
            string.set(obj, defaultValue);
        }

        System.out.println(obj);
    }
}


