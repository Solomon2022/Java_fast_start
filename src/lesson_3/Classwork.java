package lesson_3;

import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача угадать число!");
        int range = 10;
        int number = (int) (Math.random() * range);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int inputNamber = scanner.nextInt();
            if (inputNamber == number) {
                System.out.println("Вы угадали!!!");
                break;
            }else if(inputNamber > number){
                System.out.println("Загаданное число меньше!");
            }else {
                System.out.println("Загаданное число больше!");
            }
        }
        scanner.close();
    }
}
