package pl.sda.mg.annotations;

import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void processAnnotations(Object object) {
        Class<?> clazz = object.getClass();
        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
            if (myAnnotation != null) {
                String autor = myAnnotation.autor();
                String opis = myAnnotation.opis();

                System.out.println("Metoda: " + method.getName());
                System.out.println("Autor: " + autor);
                System.out.println("Opis: " + opis);
            }
        }

    }
}
