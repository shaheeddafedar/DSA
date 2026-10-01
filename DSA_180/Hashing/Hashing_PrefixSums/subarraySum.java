package DSA_180.Hashing.Hashing_PrefixSums;

import java.util.HashMap;

public class subarraySum {
    public static void main(String[] args) {
  int [] arr = {1, 2, 3, 1, 1, 1};
  int result =subarraySums(arr,6);
  System.out.println(result);        
    }
    public static  int subarraySums(int[] nums, int k) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        hs.put(0, 1);
        int prefixSum=0;
        int count =0;
        int required  =0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum+=nums[i];

            required =prefixSum-k;

            if (hs.containsKey(required )) {
                count+=hs.get(required);
            }
            hs.put(prefixSum, hs.getOrDefault(prefixSum, 0) + 1);
        }
        return  count;
    }
}
// Time O(n);
// space O(n);
