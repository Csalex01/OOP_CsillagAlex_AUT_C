import java.util.ArrayList;

public class ArrayListDictionary implements IDictionary {

    private ArrayList<String> words;
    private static ArrayListDictionary instance;

    private ArrayListDictionary() {

    }

    public static IDictionary newInstance() {
        return null;

    }

    /*
        Interface methods
     */

    @Override
    public boolean add(String word) {
        return false;
    }

    @Override
    public boolean find(String word) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
