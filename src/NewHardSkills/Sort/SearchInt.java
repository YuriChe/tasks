package NewHardSkills.Sort;

public class SearchInt implements Search{
    @Override
    public int searchInArray(int[] searchingArray, int value) {
        SearchMethods search = new SearchBi0();
        search.setData(searchingArray, value);
        return search.searching();
    }
}
