package chapter7.mathematics.and.probability.extra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Print all the decisions of equation: a^3 + b^3 = c^3 + d^3  (0 <= x < 1000)
Brute force approach takes O(n^4) complexity
We will use HashMap and decrease complexity to O(n^2)
 */
public class CubeEquation {

    public static void main(String[] args) {
        printCubeEquationDecisions();
    }

    private static void printCubeEquationDecisions() {
        Map<Integer, List<Pair>> cache = new HashMap<>();

        // fill the cache
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                int sum = i*i*i + j*j*j;
                if (!cache.containsKey(sum)) {
                    cache.put(sum, new ArrayList<>());
                }
                List<Pair> pairs = cache.get(sum);
                pairs.add(new Pair(i, j));
            }
        }

        // print all possible combinations with the same sum
        int total = 0;
        for (Map.Entry<Integer, List<Pair>> entry : cache.entrySet()) {
            for (Pair pairAB : entry.getValue()) {
                for (Pair pairCD : entry.getValue()) {
                    System.out.printf("a = %d, b = %d, c = %d, d = %d\n", pairAB.i, pairAB.j, pairCD.i, pairCD.j);
                    total++;
                }
            }
        }
        System.out.println("total = " + total);
    }
}

class Pair {
    int i;
    int j;

    public Pair(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
