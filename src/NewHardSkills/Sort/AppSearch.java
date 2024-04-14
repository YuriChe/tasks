package NewHardSkills.Sort;

import java.util.Arrays;

public class AppSearch {
    public static void main(String[] args) {
        CreateArray arrayC = new CreateArray();
        int [] array1 = arrayC.randomArray(1000, 100);
        System.out.println(Arrays.toString(array1));
        SortBubble sorting = new SortBubble();
        sorting.sort(array1);
        System.out.println(Arrays.toString(array1));
        SearchInt searchInt = new SearchInt();
        int findValue = 29;
        int foundIndex = searchInt.searchInArray(array1, findValue);
        System.out.println(findValue + " находится по индексу " + foundIndex);
    }

}
