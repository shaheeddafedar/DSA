// 1248. Count Number of Nice Subarrays
// Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.
// Return the number of nice sub-arrays.
// Example 1:
// Input: nums = [1,1,2,1,1], k = 3
// Output: 2
// Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].

package DSA_180.Sliding_Window_and_2Pointers.Sliding_Window;
public class chat_number_Of_nice_Subarrays {
public static void main(String[] args) {
    
}   


public static int numberOfOddSubarrays(int[] nums, int k) {
        if (k < 0) return 0;
       return atmost(nums,k)-atmost(nums,k-1);
    }

    public static  int atmost(int [] nums, int k){
        int l=0,r=0,oddcount=0,count=0;
       while(r<nums.length){
        if(nums[r]%2!=0){
            oddcount++;
        }
        while(oddcount>k){
            if(nums[l]%2!=0){
                oddcount--;
            }
             l++;
        }
        count+=r-l+1;
        r++;
       }
       return count;
    } 
}
//  Time:O(N);
//  Space:O(1) ; 




// Brute force
// public int numberOfSubarrays(int[] nums, int k) {
// int count=0;
// for (int i = 0; i < nums.length; i++) {
//     int oddcount=0;
//     for (int j = i; j < nums.length; j++) {
//         if (nums[j]%2!=0) {
//             oddcount++;
//         }
//         if (oddcount==k) {
//             count++;
//         }else if(oddcount>k) {
//            break;
//         }
//         
//     }
// }  
// return count;
// }
//  Time:O(N^2);
//  Space:O(1) ; 