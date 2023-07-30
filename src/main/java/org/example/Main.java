package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyArray myArray;
        while (true) {
            System.out.println("Введите первую размерность массива (высоту): ");
            String first = scanner.nextLine();
            System.out.println("Введите вторую размерность массива (ширину): ");
            String second = scanner.nextLine();
            try {
                myArray = new MyArray(Integer.parseInt(first), Integer.parseInt(second));
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Некорректно введён размер! Необходим ввод целых чисел!!!\n");
            }
            catch (MyArraySizeException e) {
                System.out.println(e.getMessage());
                System.out.printf("Вы указали массив %s х %s, а это неправильный размер массива согласно ДЗ!!!", first, second);
                System.out.println("\nПожалуйста, повторите ввод.\n\n");
            }
        }
        System.out.println("\nОТЛИЧНО! Вы создали строковый массив размерностью 4х4.");
        while (true) {
            System.out.print("\nЗаполните все элементы созданного массива:");
            int count = 1;
            for (int i = 0; i < myArray.array.length; i++) {
                for (int j = 0; j < myArray.array[i].length; j++) {
                    System.out.println("\nВведите " + count + "-й элемент массива: ");
                    myArray.array[i][j] = scanner.nextLine();
                    count++;
                }
            }
            System.out.println("\nНачинаю суммирование чисел в Вашем массиве...");
            try {
                myArray.getSum();
                break;
            } catch (MyArrayDataException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}