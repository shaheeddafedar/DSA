// Given an array nums of size n which may contain duplicate elements.
// Return a list of pairs where each pair contains a unique element from the array and its frequency in the array.
// You may return the result in any order, but each element must appear exactly once in the output
// Input: nums = [1, 2, 2, 1, 3]
// Output: [[1, 2], [2, 2], [3, 1]]
// Explanation:
// - 1 appears 2 times
// - 2 appears 2 times
// - 3 appears 1 time

package Basic_Hashing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Frequencies_count {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1, 3 };
        System.out.println(countFrequencies(arr));
    }

    public static List<List<Integer>> countFrequencies(int[] nums) {

        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        List<List<Integer>> result = new ArrayList<>();

        for (Integer key : mp.keySet()) {
            result.add(Arrays.asList(key, mp.get(key)));
        }

        return result;
    }

}