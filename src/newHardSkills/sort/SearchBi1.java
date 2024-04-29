package newHardSkills.sort;

public class SearchBi1 implements SearchMethods{
    int[] arraySearch;
    int searchingValue;
    private int currentI;

    @Override
    public int searching() {
        return searchDo(0, arraySearch.length);
    }

    @Override
    public void setData(int[] arraySearch, int searchingValue) {
        this.arraySearch = arraySearch;
        this.searchingValue = searchingValue;
    }

    private int searchDo(int low, int high) { //через рекурсию возвращает индекс первого вхождения. -1 = не найден
        currentI = low + (high - low) / 2;
        if (high - low == 1) {
            if (arraySearch[low] == searchingValue) {
                return low;
            } else if (arraySearch[high] == searchingValue) {
                return high;
            } else return -1;
        }
        if (arraySearch[currentI] == searchingValue) {
            return currentI;
        } else if (searchingValue > arraySearch[currentI]) {
            return searchDo(currentI + 1, high);
        } else {
            return searchDo(low, currentI - 1);
        }
    }
}
