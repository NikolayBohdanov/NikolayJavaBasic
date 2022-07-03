package homeWork2;
import java.util.Scanner;
public class Calculator {
    //nextLine считывает всю строку, а Next считывает до пробела.
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int numb1 = nextInt();
        int numb2 = nextInt();
        char operation = getOperation();
        int result = calc(numb1, numb2, operation);
        System.out.println("Результат операции: " + result + "  Больше не спрашивай меня. Пока \uD83D\uDC4B");
    }
    public static int nextInt() {
        System.out.println("Введи число:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Ты допустил ошибку при вводе числа. Осталась одна попытка....");
            scanner.next();//рекурсия
            num = nextInt();
        }
        return num;
    }
    public static char getOperation(){
        System.out.println("Введи операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("100210011210020djsnweocwkmrrndwoxkcmasl....Шутка.Ты допустил ошибку. Даю тебе второй шанс.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повтори ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }
}