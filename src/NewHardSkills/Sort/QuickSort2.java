package NewHardSkills.Sort;

import java.util.Arrays;

// это от чатgpt
public class QuickSort2 extends SortUnivers {

    public void quickSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int length = array.length;
        quickSort(array, 0, length - 1);
    }

    private void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                swap(array, i, j);
                /*int temp = array[i];
                array[i] = array[j];
                array[j] = temp;*/
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    protected int partition(int[] array, int low, int high)  {
        // Выбираем опорный элемент посередине
        int pivotIndex = low + (high - low) / 2;
        int pivot = array[pivotIndex];

        // Индекс элемента, меньшего опорного
        int i = low;
        int j = high;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                // Поменять элементы местами
                swap(array, i, j);
                i++;
                j--;
            }
        }

        // Возвращаем индекс опорного элемента
        return i;
    }

    private void swap(int[] array, int i, int j) {
        try {
            if (i > 6) throw new RuntimeException("Мадонна в беде");
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    @Override
    public void sort(int[] array) {
        quickSort(array);
    }
}

