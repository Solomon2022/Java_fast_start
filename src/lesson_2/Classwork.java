package lesson_2;

import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
        System.out.println("Введите ноиер операции: " );
        System.out.println("1. Сложение; \n2. Вычитание; \n3. Умножение;");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        int result;
        if (operation == 1){
            result = a + b;
        }else if (operation == 2){
            result = a - b;
        }else {
            result = a * b;
        }

        System.out.println("Результат = " + result);
    }
}
