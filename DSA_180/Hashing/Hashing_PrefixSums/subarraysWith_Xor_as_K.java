package DSA_180.Hashing.Hashing_PrefixSums;

import java.util.HashMap;

public class subarraysWith_Xor_as_K {
    public static void main(String[] args) {
        int [] arr ={4, 2, 2, 6, 4};
        int result = subarraysWithXorK(arr, 6);
        System.out.println("The total Subarray is "+result);
        
    }
    public static int subarraysWithXorK(int []arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int xor=0;
        int count=0;
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            xor =xor^arr[i];
            int x = xor^k;
            if (map.containsKey(x)) {
                count+=map.get(x);
            }
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        return count;
    }
}
// Time : O(n);
// Spce : O(1);
