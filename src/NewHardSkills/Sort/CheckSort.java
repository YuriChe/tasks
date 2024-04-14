package NewHardSkills.Sort;

public class CheckSort implements ICheck{

    @Override
    public boolean checkSort(int[] arr) {

            int compared = arr[0];
            for (int x :
                    arr) {
                if (x < compared) {
                    return false;
                }
                compared = x;
            }
            return true;
        }
    }
