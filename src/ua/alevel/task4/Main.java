package ua.alevel.task4;

import ua.alevel.task2.Value;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException, NoSuchFieldException {
        Map<Class, Object> objects = new HashMap<>();

        ScannerClass scannerClass = new ScannerClass();
        scannerClass.match();
        ArrayList<String> files = scannerClass.getFoundedFiles();

        for (String current : files) {
            Class cl = Class.forName(current);
            Constructor<?> constructor = cl.getConstructor();
            Object object = constructor.newInstance();
            objects.put(cl, object);
        }

        for (Map.Entry<Class, Object> pair : objects.entrySet()) {
            Object obj = pair.getValue();
            Class cl = obj.getClass();

            Method method = cl.getDeclaredMethod("initFunc");
            Init methodAnnotation = method.getAnnotation(Init.class);
            if (methodAnnotation != null) {
                method.invoke(obj);
            }

            Field field = cl.getDeclaredField("string");
            Value annotation = field.getAnnotation(Value.class);
            if (annotation != null) {
                String defaultValue = annotation.value();
                Field string = cl.getDeclaredField("string");
                string.setAccessible(true);
                string.set(obj, defaultValue);

                System.out.println("annotation @value: " + string.get(obj));
                System.out.println();
            }
        }
    }
}
