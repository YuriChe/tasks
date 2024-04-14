package NewHardSkills.Sort;

public class QuickSort3 extends QuickSort2 {

        @Override
        protected int partition(int[] arr, int low, int high) {
            int middle = low + (high - low) / 2;
            int pivot = arr[middle];

            // Обмен опорного элемента с последним, чтобы использовать существующую логику
            int temp = arr[middle];
            arr[middle] = arr[high];
            arr[high] = temp;

            int i = (low - 1);
            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return i + 1;
        }
    }
