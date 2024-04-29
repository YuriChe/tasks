package newHardSkills.sort;

public class SortMerge extends SortUnivers {

    @Override
    public void sort(int[] array) {
        sortingMerge(array);
    }

    private void sortingMerge(int[] arr) {

        if (arr.length <= 1) {
            return;
        }
        int mid = arr.length / 2;
        int[] arr1 = new int[mid];
        int[] arr2 = new int[arr.length - mid];
        System.arraycopy(arr, 0, arr1, 0, arr1.length);
        int j = mid;
        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2.length);
            arr2[i] = arr[j];
            j++;
//            System.out.println("check " + j + " " + arr.length);
        }
        sortingMerge(arr1);
        sortingMerge(arr2);
        mergeArr(arr1, arr2, arr);
    }


    private void mergeArr(int[] arr1, int[] arr2, int[] result) {
        int x = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < arr1.length && rightIndex < arr2.length) {
            if (arr1[leftIndex] <= arr2[rightIndex]) {
                result[x] = arr1[leftIndex];
                leftIndex++;
            } else {
                result[x] = arr2[rightIndex];
                rightIndex++;
            }
            x++;
        }
        while (leftIndex < arr1.length) {
            result[x] = arr1[leftIndex];
            x++;
            leftIndex++;
        }

        while (rightIndex < arr2.length) {
            result[x] = arr2[rightIndex];
            x++;
            rightIndex++;
        }
    }
}
