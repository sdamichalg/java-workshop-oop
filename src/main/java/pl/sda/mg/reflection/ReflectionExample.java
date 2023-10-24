package pl.sda.mg.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;

public class ReflectionExample {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Person person = new Person("John", 30);
//        person.sayHello("1", LocalDate.now());


        Class<?> clazz = person.getClass();
        System.out.println("Nazwa klasy: " + clazz.getName());

        Field[] fields = clazz.getDeclaredFields();
        System.out.println("Pola naszej klasy:");
        for (Field field : fields) {
            System.out.println("Nazwa pola: " + field.getName());
            System.out.println("Typ pola: " + field.getType());
        }

        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("Metody naszej klasy: ");
        for (Method method : methods) {
            System.out.println("Nazwa metody: " + method.getName());
            System.out.println("Typ zwracany: " + method.getReturnType());

            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("Typ parametru: " + parameterType);
            }
        }

        Method sayHelloMethod2 = clazz.getDeclaredMethod("sayHello2");
        sayHelloMethod2.setAccessible(true);
        sayHelloMethod2.invoke(person);

        Method sayHelloMethod = clazz.getDeclaredMethod("sayHello", String.class, LocalDate.class);
        sayHelloMethod.setAccessible(true);

        sayHelloMethod.invoke(person, "test", LocalDate.now());

        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.setInt(person,35);


        System.out.println("Nowy wiek: " + person.getAge());

    }
}
