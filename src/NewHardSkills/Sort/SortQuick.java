package NewHardSkills.Sort;

public class SortQuick extends SortUnivers {
    @Override
    public void sort(int[] array) {
        sortingQuick(array, 0, array.length - 1);
    }

    private void sortingQuick(int[] arr, int low, int high) {
        //получить опорный элемент
        if (low >= high) {
            return;
        }
            int partitionIndex = partition(arr, low, high);

//передать массивы в рекурсию
            sortingQuick(arr, low, partitionIndex - 1);

            sortingQuick(arr, partitionIndex + 1, high);
        }



    private int partition(int[] arr, int low, int high) {

        int pivotIndex = low + (high - low) / 2;;
        int pivot = arr[pivotIndex];

        int rightIndex = high;
        int leftIndex = low;
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] <= pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                 rightIndex--;
            }
            //переместить элементы меньше или равного опорного налево
            // переместить элементы больше опорного направо
            if (rightIndex > leftIndex) {
                //меняем местами
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return pivotIndex;
    }

    private void swap (int[] arr, int i, int j){
        int x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;
    }

}
