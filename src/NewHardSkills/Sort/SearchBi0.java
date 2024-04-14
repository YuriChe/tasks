package NewHardSkills.Sort;

public class SearchBi0 implements SearchMethods{
    int[] arraySearch;
    int searchingValue;
    private int currentI;

    @Override
    public int searching() {
        return search2(0, arraySearch.length);
    }

    @Override
    public void setData(int[] arraySearch, int searchingValue) {
        this.arraySearch = arraySearch;
        this.searchingValue = searchingValue;
    }

    private int search2(int low, int high) { //через рекурсию возвращает индекс первого вхождения. -1 = не найден
        currentI = low + (high - low) / 2;
        if (low <= high) {
            if (arraySearch[currentI] == searchingValue) {
                return currentI;
            } else if (searchingValue > arraySearch[currentI]) {
                return search2(currentI + 1, high);
            } else {
                return search2(low, currentI - 1);
            }
        }
        return -1;
    }
}
