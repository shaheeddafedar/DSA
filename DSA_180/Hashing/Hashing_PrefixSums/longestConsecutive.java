package DSA_180.Hashing.Hashing_PrefixSums;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutive {
    public static void main(String[] args) {
        int[] arr = { 100, 4, 200, 1, 3, 2 };
        int result = longestConsecutives(arr);
        System.out.println("Result is : " + result);
    }

    public static  int longestConsecutives(int[] nums) {
              if (nums.length == 0) {
                return 0;
        }
        Set<Integer> set = new HashSet<>();
            int longest =1,count=0;
            for (int num : nums) {
                set.add(num);
            }
            for (int num : set) {
                if (!set.contains(num-1)) {
                    count=1;
                    int x =num;
                    while (set.contains(x+1)) {
                        count++;
                      x++;
                    }
                    
                    longest = Math.max(longest, count);
                }
            }
            return longest;
           
        }
}
// Time → O(n)
// Space → O(n)


// Brute Force
// public static  int longestConsecutives(int[] nums) {
//            int  longest=0;
//            for (int i = 0; i < nums.length; i++) {
//             int x =nums[i];
//             int count=1;
//             while (search(nums,x+1)) {
//                 x++;
//                 count++;
//             }
//              longest = Math.max(longest, count);
//            }
//            return longest;
//         }
//         public  static  boolean search(int [] arr, int targert){
//             for (int i = 0; i < arr.length; i++) {
//                 if (arr[i]==targert) {
//                     return  true;
//                 }
//             }
//             return false;

//         }
//         Time O(n^2);
//         Space O(1);


// public static  int longestConsecutives(int[] nums) {
//               if (nums.length == 0) {
//                 return 0;
//         }
//             Arrays.sort(nums);
//           int longest=1,count=0;
//           int lastSmaller = Integer.MIN_VALUE;
//           for (int i = 0; i < nums.length; i++) {
//             if (nums[i]-1==lastSmaller ) {
//                 count++;
//                 lastSmaller=nums[i];
//             } else if (nums[i]!=lastSmaller) {
//                 count=1;
//                 lastSmaller=nums[i];
//             }
//              longest= Math.max(longest, count);
//           }
//                  return longest;
//         }
// Time: O(n log n)
//  space: O(1)