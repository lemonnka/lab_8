import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StringCollectionOperations {
    private ArrayList<String> stringList;

    public StringCollectionOperations() {
        this.stringList = new ArrayList<>();
    }

    public void fillCollection(String[] strings) {
        Collections.addAll(this.stringList, strings);
    }

    public void addString(String newString) {
        this.stringList.add(newString);
    }

    public void removeString(String stringToRemove) {
        this.stringList.remove(stringToRemove);
    }

    public Map<String, Integer> findDuplicateStrings() {
        Map<String, Integer> occurrences = new HashMap<>();
        for (String str : this.stringList) {
            occurrences.put(str, occurrences.getOrDefault(str, 0) + 1);
        }
        return occurrences;
    }

    public void reverseStrings() {
        for (int i = 0; i < this.stringList.size(); i++) {
            this.stringList.set(i, new StringBuilder(this.stringList.get(i)).reverse().toString());
        }
    }

    public Map<Character, Integer> getCharactersStatistics() {
        Map<Character, Integer> charCount = new HashMap<>();
        for (String str : this.stringList) {
            for (char c : str.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        return charCount;
    }

    public ArrayList<String> searchSubstring(String substring) {
        ArrayList<String> foundStrings = new ArrayList<>();
        for (String str : this.stringList) {
            if (str.contains(substring)) {
                foundStrings.add(str);
            }
        }
        return foundStrings;
    }

    public Map<String, Integer> getLengthStatistics() {
        Map<String, Integer> lengthStats = new HashMap<>();
        for (String str : this.stringList) {
            lengthStats.put(str, str.length());
        }
        return lengthStats;
    }

    public void printOrderedResults() {
        Collections.sort(this.stringList);
        for (String str : this.stringList) {
            System.out.println(str);
        }
    }
}
