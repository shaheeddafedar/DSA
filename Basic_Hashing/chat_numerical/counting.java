package Basic_Hashing.chat_numerical;

import java.util.HashMap;

public class counting {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 5, 2, 5 };
        int result = countFrequency(arr, 5);
        System.out.println(result);

    }

    public static int countFrequency(int[] nums, int target) {
        int targo = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);

        }
        if (mp.containsKey(target)) {
            targo = mp.get(target);
        }
        return targo;

    }
}
