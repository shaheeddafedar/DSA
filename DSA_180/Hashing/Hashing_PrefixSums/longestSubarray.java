package DSA_180.Hashing.Hashing_PrefixSums;


public class longestSubarray {
 public static void main(String[] args) {
  int [] nums = {1, 2, 3, 1, 1, 1};
  int result = longestSubarrays(nums, 6);
  System.out.println("The longest Sub Array is "+result);
    
 }  
    public static int longestSubarrays(int[] nums, int k) {
       int sum =nums[0];
       int maxlen =0;
       int left=0;
       int right =0;
       while (right<nums.length) {
        while (left<right && sum>k) {
            sum-=nums[left];
            left++;
        }
        if (sum==k) {
            maxlen=Math.max(maxlen, right-left+1);
        }
        right++;
        if (right<nums.length) {
            sum+=nums[right];
        }
       }
      return maxlen;
    } 
}


// Optimal
// public static int longestSubarray(int[] nums, int k) {
//     int maxLen = 0;
//     for (int i = 0; i < nums.length; i++) {
//         int sum = 0;
//         for (int j = i; j < nums.length; j++) {
//             sum = sum + nums[j];
//             if (sum == k) {
//                 int len = j - i + 1;
//                 maxLen = Math.max(maxLen, len);
//             }
//         }
//     }
//     return maxLen;
// }
//Time: O(n²)
// Space: O(1)


// Better
// public static int longestSubarray(int[] nums, int k) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int sum =0;
//        int maxlen =0;
//        for (int i = 0; i < nums.length; i++) {
//         sum=sum+nums[i];
//         if (sum==k) {
//             maxlen=i+1;
//         }
//         int remender = sum-k;
//         if (map.containsKey(remender)) {
//         int len = i-map.get(remender);
//         maxlen=Math.max(maxlen, len);
//         }
//         if (!map.containsKey(sum)) {
//             map.put(sum, i);   
//         }
//        }
//        return maxlen;
//     } 
// Time: O(n)
 // Space: O(n)