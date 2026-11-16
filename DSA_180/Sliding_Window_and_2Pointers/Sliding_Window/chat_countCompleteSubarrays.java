// 2799. Count Complete Subarrays in an Array
// You are given an array nums consisting of positive integers.
// We call a subarray of an array complete if the following condition is satisfied:
// The number of distinct elements in the subarray is equal to the number of distinct elements in the whole array.
// Return the number of complete subarrays.
// A subarray is a contiguous non-empty part of an array.
// Example 1:
// Input: nums = [1,3,1,2,2]
// Output: 4
// Explanation: The complete subarrays are the following: [1,3,1,2], [1,3,1,2,2], [3,1,2] and [3,1,2,2].


package DSA_180.Sliding_Window_and_2Pointers.Sliding_Window;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class chat_countCompleteSubarrays {
    public static void main(String[] args) {
        
    }
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int totalDistinct = set.size();
        int count =0;
        int l=0,r=0;
         HashMap<Integer, Integer> map = new HashMap<>();
            while(r<nums.length){
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
             while(map.size()==totalDistinct){
                 count += nums.length - r;
                 map.put(nums[l], map.get(nums[l]) - 1);
                 if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l++;
             }
             r++;
            }
           return count;
        }
}
//     Time:O(N);
//     Space:O(1);


// Brute force
// public int countCompleteSubarrays(int[] nums) {
//         Set<Integer> set = new HashSet<>();
//         for (int num : nums) {
//             set.add(num);
//         }
//         int totalDistinct = set.size();
//         int count =0;
//         for(int i =0;i<nums.length;i++){
//          HashMap<Integer, Integer> map = new HashMap<>();
//             for(int j =i;j<nums.length;j++){
//                 map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
//              if(map.size()==totalDistinct){
//                 count++;
//              }
//             }
//         }
//         return count;
//     }
//     Time:O(N^2);
//     Space:O(1);