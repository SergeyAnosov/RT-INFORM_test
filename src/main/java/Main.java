import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] testArray = {1, 3, 4, 5, 1, 5, 4};

        printMap(countElements(testArray));
    }

    public static HashMap<Integer, Integer> countElements(int[] array) {
        HashMap<Integer, Integer> solution = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (solution.containsKey(array[i])) {
                solution.put(array[i], solution.get(array[i]) + 1);
            } else {
                solution.put(array[i], 1);
            }
        }
        return solution;
    }

    public static void printMap(HashMap<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            System.out.println("элемент: " + key + " встречается: " + value + " раз(а)");
        }
    }
}
