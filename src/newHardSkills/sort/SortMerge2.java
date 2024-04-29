package newHardSkills.sort;

import java.util.Arrays;

public class SortMerge2 {


    //сортировка слиянием merge sort
    public static void main(String[] args) {
        //  int[] array = {1, 5, 3, 16, 76, 34, 85, 23, 13, 54, 2, 77, 6, 99, 8, -7};
        int[] array = {4, 3, 2, 1};
        System.out.println("Сортируем массив: " + Arrays.toString(array));
        System.out.println(Arrays.toString(sortArray(array)));
    }

    public static int[] sortArray(int[] array) {
        if (array == null) {
            return null;
        }
        //базовый случай
        if (array.length < 2) {
            System.out.println(Arrays.toString(array));
            System.out.println("Массив меньше двух, возвращаем значение");
            return array;
        }
        //Копируем левую часть от начала до середины
        int[] arrayLeft = new int[array.length / 2];
        System.arraycopy(array, 0, arrayLeft, 0, array.length / 2);
        System.out.println("Скопировали левую часть массива");
        System.out.println("Левая часть: " + Arrays.toString(arrayLeft));
        //копируем правую часть от середины до начала массива
        int[] arrayRight = new int[array.length / 2];
        System.arraycopy(array, array.length / 2, arrayRight, 0, array.length - array.length / 2);
        System.out.println("Скопировали правую часть массива");
        System.out.println("Правая часть: " + Arrays.toString(arrayRight));
        //рекурсивно вызываем метод у частей массива. Будет вызывать до базового случая
        System.out.println("Рекурсивно вызываем sortArray для левой части");
        arrayLeft = sortArray(arrayLeft);
        System.out.println("Рекурсивно вызываем sortArray для правой части");
        arrayRight = sortArray(arrayRight);

        return mergeArray(arrayLeft, arrayRight);
    }

    private static int[] mergeArray(int[] arrayA, int[] arrayB) {
        System.out.println("Вызван метод merge Array");
        System.out.println("int[] arrayA: " + Arrays.toString(arrayA));
        System.out.println("int[] arrayB: " + Arrays.toString(arrayB));

        int[] arrayC = new int[arrayB.length + arrayA.length];
        int positionA = 0;
        int positionB = 0;
        String format = "Объединенный массив: " + Arrays.toString(arrayC) + ",positionA: %d,positionB: %d";
        System.out.println("Вошли в цикл, количество итераций: " + arrayC.length);
        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length) {
                System.out.printf("Сработало условие if positionA(%d) == arrayA.length(%d) %n", positionA, arrayA.length);
                System.out.printf("Присвоение arrayC[%d](%d) arrayB[%d](%d)%n", i, arrayC[i], positionB, arrayB[positionB]);
                arrayC[i] = arrayB[positionB];
                System.out.println("Инкремент positionB, было: " + positionB + ", стало: " + positionB + 1);
                positionB++;
            } else if (positionB == arrayB.length) {
                System.out.println(String.format("Сработало условие else if positionB(%d) == arrayB.length(%d) ", positionB, arrayB.length));
                System.out.println(String.format("Присвоение arrayC[%d](%d) arrayA[%d](%d)", i, arrayC[i], positionA, arrayA[positionA]));
                arrayC[i] = arrayA[positionA];
                System.out.println("Инкремент positionA, было: " + positionA + ", стало: " + (positionA + 1));
                positionA++;
            } else if (arrayA[positionA] < arrayB[positionB]) {
                System.out.println(String.format("Сработало условие else if arrayA[%d]<arrayB[$d] ", positionA, positionB));
                System.out.println(String.format("Присвоение arrayC[%d] arrayA[%d]", i, positionA));
                arrayC[i] = arrayA[positionA];
                System.out.println("Инкремент positionA, было: " + positionA + ", стало: " + (positionA + 1));
                positionA++;
            } else {
                System.out.println(String.format("Сработало условие else"));
                System.out.println(String.format("Присвоение arrayC[%d](%d) arrayB[%d](%d)", i, arrayC[i], positionB, arrayB[positionB]));
                arrayC[i] = arrayB[positionB];
                System.out.println("Инкремент positionB, было: " + positionB + ", стало: " + (positionB + 1));
                positionB++;
            }
        }
        System.out.println("Возвращение объебиненного массива: " + Arrays.toString(arrayC));
        return arrayC;
    }

    //System.arrayCopy(from, fromIndex, to, toIndex, count);
    //
    //from - массив, который копируем
    //to - массив в которой копируем
    //fromIndex - индекс в массиве from начиная с которого берем элементы для копирования
    //toIndex - индекс в массиве to начиная с которого вставляем элементы
    //count - количество элементов которые берем из массива from и вставляем в массив to
    //Массив to должен иметь достаточный размер, чтобы в нем уместились все копируемые элементы.
}

