package chapter9.recursion.and.dynamics.task4;


import java.util.ArrayList;

public class ShowAllSubsets {

    public static ArrayList<ArrayList<String>> getAllSubsets(ArrayList<String> set, int index) {

        if (index == 0) {
            ArrayList<ArrayList<String>> allSubSets = new ArrayList<ArrayList<String>>();
            allSubSets.add(new ArrayList<String>());
            return allSubSets;
        } else if (index > 0) {
            ArrayList<ArrayList<String>> currentSubsets = getAllSubsets(set, index - 1);
            int size = currentSubsets.size();
            for (int i = 0; i < size; i++) {
                ArrayList<String> newSubset = new ArrayList<>();

                ArrayList<String> subSet = currentSubsets.get(i);
                newSubset.addAll(subSet);
                newSubset.add(set.get(index - 1));
                currentSubsets.add(newSubset);
            }
            return currentSubsets;
        } else {
            System.err.println("Bad index");
            return null;
        }
    }

    public static void main(String[] args) {
        ArrayList<String> set = new ArrayList<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");

        ArrayList<ArrayList<String>> allSubsets = getAllSubsets(set, set.size());
        System.out.println(allSubsets);
        System.out.println("size = " + allSubsets.size());
    }
}
