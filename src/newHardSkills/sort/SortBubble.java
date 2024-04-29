package newHardSkills.sort;

public class SortBubble extends SortUnivers{
    private int x;

    private int[] sortBubble(int[] arrayToSort) {
        int[] arrInt = arrayToSort;
        for (int i = 0; i < arrInt.length - 1; i++) {
            for (int j = 0; j < arrInt.length - i - 1; j++) {
                if (arrInt[j] > arrInt[j + 1]) {
                    x = arrInt[j];
                    arrInt[j] = arrInt[j + 1];
                    arrInt[j + 1] = x;
                }
            }
        }
        return arrInt;
    }

    @Override
    public void sort(int[] arr) {
        arr = sortBubble(arr);
    }

}
