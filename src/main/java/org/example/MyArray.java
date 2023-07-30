package org.example;

public class MyArray {
        protected int height;
        int width;
        String[][] array;
        public MyArray(int height, int width) throws MyArraySizeException {
                if (height != 4)
                        throw new MyArraySizeException("Согласно условия ДЗ размерность массива должна быть 4х4!!!");
                else this.height = height;
                if (width != 4)
                        throw new MyArraySizeException("Согласно условия ДЗ размерность массива должна быть 4х4!!!");
                else this.width = width;
                array = new String[height][width];
        }
        public void getSum() throws MyArrayDataException {
                int sum = 0;
                for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                                if (!array[i][j].matches("-?\\d+(\\.\\d+)?")) {
                                        throw new MyArrayDataException("В созданном Вами массиве содержатся НЕ ТОЛЬКО ЧИСЛА!!\nЭто противоречит условиям ДЗ!\n");
                                }
                                else sum += Integer.parseInt(array[i][j]);
                        }
                }
                System.out.printf("Сумма чисел в Вашем массиве равна %d", sum);
        }
}
