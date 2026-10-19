package DSA_180.BinarySearch.Search_on_answer;
import java.util.Arrays;

public class aggressive_cows {
    public static void main(String[] args) {
        int [] nums ={0, 3, 4, 7, 10, 9};
        int k =4;
        int result = aggressiveCows(nums, k);
        System.out.println(result);
    }
    public static int aggressiveCows(int []nums, int k){
            Arrays.sort(nums);
            int low =0;
            int high =nums[nums.length-1]-nums[0];
            int ans =-1;
            while (low<=high) {
                int mid =(low+high)/2;
                if (canPlaceCows(nums,mid,k)) {
                    ans=mid;
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
            return ans;
    }
   public static boolean canPlaceCows(int [] arr, int dist , int k){
    int cow=1;
    int lastPos=arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i]-lastPos>=dist) {
            cow++;
            lastPos=arr[i];
        }
    }
         if(cow>=k){
            return true;
        }
        return false;
   }
}

//  time complexity:O(n log n+n log D)
// Space:O(1)

//Brute force
// public static int aggressiveCows(int[] nums, int k) {
//     Arrays.sort(nums);
//     int n = nums.length;
//     int maxDist = nums[n - 1] - nums[0];
//     int ans = 0;
//     for (int dist = 1; dist <= maxDist; dist++) {
//         if (canPlaceCows(nums, k, dist)) {
//             ans = dist;
//         }
//     }
//     return ans;
// }

// public static boolean canPlaceCows(int[] nums, int k, int dist) {
//     int cows = 1;
//     int lastPos = nums[0];
//     for (int i = 1; i < nums.length; i++) {
//         if (nums[i] - lastPos >= dist) {
//             cows++;
//             lastPos = nums[i];
//         }
//         if (cows >= k) {
//             return true;
//         }
//     }

//     return false;
// }
// time:O(nlogn+nD)
// Space:O(1)