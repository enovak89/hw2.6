import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 6, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("ab", "bc", "ab", "cd", "cd", "de", "cd", "cd", "bc"));
        System.out.println("Task 1");
        printOdd(nums);
        System.out.println("\nTask 2");
        printEven(nums);
        System.out.println("\nTask 3");
        printWord(words);
        System.out.println("Task 4");
        printNumberOfWordRepeats(words);
    }

    public static void printOdd(List<Integer> nums) {
        for (Integer integer : nums) {
            if (integer % 2 == 1) {
                System.out.print(integer + " ");
            }
        }
    }

    public static void printEven(List<Integer> nums) {
        Set<Integer> setOfInteger = new HashSet<>(nums);
        nums.clear();
        nums.addAll(setOfInteger);
        Collections.sort(nums);
        for (Integer integer : nums) {
            if (integer % 2 == 0) {
                System.out.print(integer + " ");
            }
        }
    }

    public static void printWord(List<String> words) {
        Set<String> setOfString = new HashSet<>(words);
        System.out.println(setOfString);
    }

    public static void printNumberOfWordRepeats(List<String> words) {
        Map<String, Integer> repeats = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            repeats.merge(words.get(i), 1, (x, y) -> x + y);
        }
        for (Map.Entry<String, Integer> m : repeats.entrySet()) {
            if (m.getValue() > 1) {
                System.out.print(m.getValue() + " ");
            }
        }
    }


}