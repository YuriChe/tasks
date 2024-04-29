package newHardSkills.sort;

import java.util.Arrays;

public class MergeSort {

        public static void mergeSort(int[] array) {
            if (array.length <= 1) {
                return;
            }

            int middle = array.length / 2;
            int[] leftArray = new int[middle];
            int[] rightArray = new int[array.length - middle];

            // Заполняем левый массив
            for (int i = 0; i < middle; i++) {
                leftArray[i] = array[i];
            }

            // Заполняем правый массив
            for (int i = middle; i < array.length; i++) {
                rightArray[i - middle] = array[i];
            }

            // Рекурсивно сортируем левый и правый массивы
            mergeSort(leftArray);
            mergeSort(rightArray);

            // Объединяем отсортированные массивы
            merge(array, leftArray, rightArray);
        }

        private static void merge(int[] array, int[] leftArray, int[] rightArray) {

            int leftIndex = 0, rightIndex = 0, mergedIndex = 0;

            // Сравниваем элементы из левого и правого массивов и объединяем их
            while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                    array[mergedIndex] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[mergedIndex] = rightArray[rightIndex];
                    rightIndex++;
                }
                mergedIndex++;
            }

            // Копируем оставшиеся элементы из левого массива
            while (leftIndex < leftArray.length) {
                array[mergedIndex] = leftArray[leftIndex];
                leftIndex++;
                mergedIndex++;
            }

            // Копируем оставшиеся элементы из правого массива
            while (rightIndex < rightArray.length) {
                array[mergedIndex] = rightArray[rightIndex];
                rightIndex++;
                mergedIndex++;
            }
        }

        public static void main(String[] args) {
            int[] array = {12, 11, 13, 5, 6, 7};
            System.out.println("Исходный массив: " + Arrays.toString(array));

            mergeSort(array);

            System.out.println("Отсортированный массив: " + Arrays.toString(array));
        }
    }

