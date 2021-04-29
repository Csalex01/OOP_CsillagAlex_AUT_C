public interface IDictionary {
    String DICTIONARY_FILE = null;

    boolean add(String word);
    boolean find(String word);

    int size();
}
