import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(50, 55, 57, 58, 60);
        int maxDistance = 175;
        int numCities = 3;
        int result = chooseBestSum(maxDistance, numCities, l);
        System.out.println(result);
    }

    public static int chooseBestSum(int maxDistance, int numCities, List<Integer> l) {
        List<List<Integer>> combinations = new ArrayList<>();
        generateCombinations(combinations, l, new ArrayList<>(), 0, numCities);
        int maxSum = 0;
        for (List<Integer> combination : combinations) {
            int sum = combination.stream().mapToInt(Integer::intValue).sum();
            if (sum <= maxDistance && sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    private static void generateCombinations(List<List<Integer>> combinations, List<Integer> l, List<Integer> current, int start, int numCities) {
        if (current.size() == numCities) {
            combinations.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < l.size(); i++) {
            current.add(l.get(i));
            generateCombinations(combinations, l, current, i + 1, numCities);
            current.remove(current.size() - 1);
        }
    }
}
