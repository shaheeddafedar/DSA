package DSA_180.BinarySearch.Search_on_answer;

public class book_allocation_problem {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int m = 2;
        int result = findpages(arr, m);
        System.out.println("Minimum maximum pages: " + result);
    }
    public static int findpages(int []arr, int m){
        int n = arr.length;
        if (m>n) {
            return -1;
        }
        int low=0;
        int high=0;
        for (int i = 0; i < arr.length; i++) {
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }
        int ans =-1;
        while (low<=high) {
            int mid =(low+high)/2;
            if (canAlocatepages(arr,mid,m)) {
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static boolean canAlocatepages(int []arr, int mid ,int m){
        int student=1;
        int pages=0;
        for (int i = 0; i < arr.length; i++) {
            if (pages+arr[i]<=mid) {
                pages+=arr[i];
            }else{
                student++;
                pages=arr[i];
            }
        }
        if (student>m) {
            return false;
        }
        return true;
    }
}
// Time: O(n log S)
// space: O(1)



//Brute Force
//  public int findPages(int[] nums, int m) {
//         int n = nums.length;
//         if(m>n){
//             return -1;
//         }
//         int low=0;
//         int high =0;
//         for(int i =0;i<nums.length;i++){
//             low=Math.max(low,nums[i]);
//             high+=nums[i];
//         }
//         for(int limit = low;limit<=high;limit++){
//             if(canAllocate(nums,m,limit)){
//                 return limit;
//             }
//         }
//         return -1;
//     }
//     public static boolean canAllocate(int arr[],int m,int limit ){
//         int student=1;
//         int pages=0;
//         for(int i =0;i<arr.length;i++){
//             if(pages+arr[i]<=limit){
//                 pages+=arr[i];
//             } else{
//                 student++;
//                 pages=arr[i];
//             }
//         }
//         if(student>m){
//             return false;
//         }
//          return true;
//     }
// Time: (O(n log n+nS))
// space: (O(1))