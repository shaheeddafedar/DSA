package Basic_Hashing.chat_numerical;

import java.util.HashMap;

public class Frequent_Element {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 3, 1, 3};
        int result = Frequent_value(nums);
        System.out.println("The maximum element is "+result);

    }

    public static int Frequent_value(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        int max = 0;
        int result =0;
        for (Integer keys : mp.keySet()) {
            int frequncy = mp.get(keys);
            if (frequncy>max) {
                max = frequncy;
          result = keys;
            }
        }
        return result;

    }
}
