package chat_problems;

public class searchInsert {
    public static void main(String[] args) {
        
    }
      public static  int searchInserts(int[] nums, int target) {
        int low =0;
        int high = nums.length-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(nums[mid]<target){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return low;
    }
}
// time O(log n)
// Space O(1)

//    Brute
    // public static int searchInsert(int[] nums, int target) {
    //     for(int i =0;i<nums.length;i++){
    //        if(nums[i]>=target){
    //         return i;
    //        }
    //     }
    //     return nums.length;
    // }
    // time:O(n)
    // Space:O(1)