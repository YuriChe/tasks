package newHardSkills.sort;

import java.util.ArrayList;

public class CreateArray {

    public int[] randomArray(int arraySize, int range) {
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * range);
        }
        return array;
    }

    public Integer[] randomArrayInteger(int arraySize, int range) {
        Integer[] array = new Integer[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * range);
        }
        return array;
    }
    public ArrayList<Integer> randomArrayList(int size, int range) {
        ArrayList<Integer> array = new ArrayList<>(size);
        int x;
        for (int i = 0; i < size; i++) {
            x = (int) (Math.random() * range);
            array.add(x);
        }
        return array;
    }

}


