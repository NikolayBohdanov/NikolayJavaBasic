package homeWork19.Task3;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionAPI {
    public static void main(String[] args) {
        Bet bet = new Bet();
        String customerName = null;
        String customerID = null;
        double risk;
        int betValue;
        try {
            //находим приватные поля и без сетеров меняем их
            System.out.println(Arrays.toString(bet.getClass().getDeclaredFields()));

            Field field = bet.getClass().getDeclaredField("customerName");
            field.setAccessible(true);
            customerName = (String) field.get(bet);
            field.set(bet, (String) "I found your Name.");
            //нахожу аннотации у поля
            if (!Arrays.toString(field.getDeclaredAnnotations()).equals("[]")) {
                System.out.println("Field 'customerName' contains annotation" + Arrays.toString(field.getDeclaredAnnotations()));
            }
            Field field1 = bet.getClass().getDeclaredField("customerID");
            field1.setAccessible(true);
            customerID = (String) field1.get(bet);
            field1.set(bet, (String) "I found your ID.");
            if (!Arrays.toString(field1.getDeclaredAnnotations()).equals("[]")) {
                System.out.println("Field 'customerID' contains annotation " + Arrays.toString(field1.getDeclaredAnnotations()));
            }

            Field field2 = bet.getClass().getDeclaredField("risk");
            field2.setAccessible(true);
            field2.set(bet, (double) 1.0101);
            if (!Arrays.toString(field2.getDeclaredAnnotations()).equals("[]")) {
                System.out.println("Field 'risk' contains annotation " + Arrays.toString(field2.getDeclaredAnnotations()));
            }

            Field field3 = bet.getClass().getDeclaredField("betValue");
            field3.setAccessible(true);
            field3.set(bet, (int) 0);
            if (!Arrays.toString(field3.getDeclaredAnnotations()).equals("[]")) {
                System.out.println("Field 'betValue' contains annotation " + Arrays.toString(field3.getDeclaredAnnotations()));
            }
            //находим приватный методы и вызываем его
            System.out.println(Arrays.toString(bet.getClass().getDeclaredMethods()));

            Method method = bet.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            method.invoke(bet);
            //находим какие есть конструкторы и создаем объект с помощью рефлексии
            Class clazz = Class.forName(Bet.class.getName());
            Class[] params = {int.class, String.class, String.class};
            bet = (Bet) clazz.getConstructor(params).newInstance(0, null, null);
            System.out.println(bet);
            //       C помощью этой конструкции вычислел какие есть конструкторы и сверху переписал один. При печати объекта видно, что параметры такие, как я задал в конструкторе.
            //       Constructor[] constructors = clazz.getConstructors();
            //       for (Constructor constructor : constructors) {
            //           Class[] paramTypes = constructor.getParameterTypes();
            //           for (Class paramType : paramTypes) {
            //               System.out.print(paramType.getName() + " ");
            //           }
            //           System.out.println();
            //       }

            //нахожу аннотации у класса
            if (!Arrays.toString(bet.getClass().getAnnotations()).equals("[]")) {
                System.out.println("Class 'Bet' contains annotation " + Arrays.toString(bet.getClass().getAnnotations()));
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | ClassNotFoundException |
                 InstantiationException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        //показываю измененные переменные без метода set, а с помощью конструктора через рефлексию
        System.out.println(bet.getCustomerName());
        System.out.println(bet.getCustomerID());
        System.out.println(bet.getBetValue());
    }
}
