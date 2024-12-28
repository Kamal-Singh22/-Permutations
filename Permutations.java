import java.util.*;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(nums, current, visited, result);
        return result;
    }

    private static void backtrack(int[] nums, List<Integer> current, boolean[] visited, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                current.add(nums[i]);
                backtrack(nums, current, visited, result);
                current.remove(current.size() - 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the nums array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the nums array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        List<List<Integer>> result = permute(nums);
        System.out.println("All permutations are: ");
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }
}
