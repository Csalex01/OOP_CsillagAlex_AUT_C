import java.util.ArrayList;

public class DictionaryProvider {
    public static IDictionary createDictionary(DictionaryType type) {

        if(type == DictionaryType.ARRAY_LIST) {
            return ArrayListDictionary.newInstance();
        }

        return null;

    }
}
