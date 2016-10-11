package chapter1.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task1IsStringUnique {

    public boolean isUniqueWithSet(String string) {
        if (string == null || string.length() == 0) return true;

        Set<Integer> charSet = new HashSet<>();
        for (char ch : string.toCharArray()) {
            if (charSet.contains(Integer.valueOf(ch))) return false;
            charSet.add(Integer.valueOf(ch));
        }
        return true;
    }

    public boolean isUniqueWithSort(String string) {
        if (string == null || string.length() == 0) return true;

        char[] sortedChars = string.toCharArray();
        Arrays.sort(sortedChars);
        for (int i = 0; i < sortedChars.length - 1; i++) {
            if (sortedChars[i] == sortedChars[i+1]) return false;
        }
        return true;
    }

    // if string contains only [a-z] symbols
    public boolean isUniqueWithAscii(String string) {
        if (string == null || string.length() == 0) return true;
        if (string.length() > 256) return false;

        int bitChecker = 0;
        for (int i = 0; i < string.length(); i++) {
            int ch = string.charAt(i) - 'a';
            if (ch < 0  || ch > 25) {
                System.err.println("Unexpected symbol: " + ch);
                return false;
            }
            if ((bitChecker & (1 << ch)) > 0) return false;
            bitChecker |= 1 << ch;
        }
        return true;
    }

    public static void main(String[] args) {
        new Task1IsStringUnique().isUniqueWithAscii("abc");
    }
}
