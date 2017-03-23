package chapter11.sorting.and.searching.extra.dublicates;

import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class SolutionWithStreams {
    public static void main(String[] args) throws FileNotFoundException {


        String input = "This   is a file with many words.\n" +
                "Some of the words appear more than once.\n" +
                "Some of the words only appear one time.\n";

        System.out.println(findMostFrequencyWords(input, 5));
    }

    private static List<String> findMostFrequencyWords(String input, int n) throws FileNotFoundException {

        List<String> words = wordsFromString(input);

        Map<String, Long> wordMap = words.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        List<String> result = wordMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(n)
                .map(e -> e.getKey())
                .collect(Collectors.toList());
        return result;
    }

    private static List<String> wordsFromString(String input) throws FileNotFoundException {

        List<String> result = new ArrayList<>();
        String[] wordArray = input.split("\\W+");
        result.addAll(Arrays.asList(wordArray));

        return result;
    }
}

