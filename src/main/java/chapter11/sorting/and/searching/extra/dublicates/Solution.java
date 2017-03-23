package chapter11.sorting.and.searching.extra.dublicates;

import java.io.FileNotFoundException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {

        String input = "This   is a file with many words.\n" +
                "Some of the words appear more than once.\n" +
                "Some of the words only appear one time.\n";

        System.out.println(findMostFrequencyWords(input, 5));
    }

    private static List<String> findMostFrequencyWords(String input, int n) throws FileNotFoundException {

        // Step 1: split string into words list
        List<String> words = wordsFromString(input);

        // Step 2: create hash map: word -> count
        Map<String, Integer> map = createWordMapFromList(words);

        // Step 3: sort collection
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>();
        entryList.addAll(map.entrySet());
        Collections.sort(entryList, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        System.out.println(entryList);

        // Step 4: return result list
        return firstNStrings(n, entryList);
    }

    private static List<String> firstNStrings(int n, List<Map.Entry<String, Integer>> entryList) {
        int returnNumber = Math.min(n, entryList.size());
        List<String> result = new ArrayList<>();
        for (int i = 0; i < returnNumber; i++) {
            result.add(entryList.get(i).getKey());
        }
        return result;
    }

    private static List<String> wordsFromString(String input) throws FileNotFoundException {

        List<String> result = new ArrayList<>();
        String[] wordArray = input.split("\\W+");
        result.addAll(Arrays.asList(wordArray));

        return result;
    }

    private static Map<String, Integer> createWordMapFromList(List<String> words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 0);
            }
            map.put(word, map.get(word) + 1);
        }
        return map;
    }
}
