

package DSA_180.Sliding_Window_and_2Pointers.counting_windows;

public class binary_subarrays_sum {
    public static void main(String[] args) {
        
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        return atmost(nums,goal)-atmost(nums,goal-1);
    }
    public static int atmost(int [] nums,int goal){
        if (goal < 0) return 0;
        int count=0;
        int sum =0;  
         int l=0,r=0;
         while(r<nums.length){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            count+=r-l+1;
            r++;
         }
        
        return count;
    }
    // Time:O(n)
    //  Space:O(1) 
}


    // Brute force
    // public int numSubarraysWithSum(int[] nums, int goal) {
    //    int count=0;
    //     for(int i =0;i<nums.length;i++){
    //         int sum =0;  
    //      for(int j=i;j<nums.length;j++){
    //         sum+=nums[j];
    //         if(sum==goal){
    //             count++;
    //         } else if(sum>goal){
    //             break;
    //         }
    //      }
    //     }
    //     return count;
    // }
    // Time:O(n^2)
    //  Space:O(1) 