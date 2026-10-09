package DSA_180.BinarySearch.Binary_Search;

public class find_minimum {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
         int Result = findMin(arr);
        System.out.println("Search Minimum: " + Result);
    }
    public static int findMin(int [] arr){
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = arr.length-1;
        while (low<=high) {
            int mid =(low+high)/2;
            if (arr[low]<=arr[mid]) { 
                min = Math.min(min,arr[low]);// Left sorted half so left as Smallest element 
                low =mid+1;
            } else {
                min = Math.min(min,arr[mid]);// right sorted half so mid as Smallest element 
                high=mid-1;
            }
        }
        return min;
    }
}
// Time:  O(log n)
// Space: O(1)

     // Brute Force Solution
    // public static int findMinBruteForce(int[] arr) {
    //     int min = Integer.MAX_VALUE;               
    //     for (int i = 0; i < arr.length; i++) {
    //         min = Math.min(min, arr[i]);
            //  or
            //  if (arr[i] < min) {
            // min = arr[i];
            //  }
    //     }
    //     return min;
    // }
// Time:  O(n)
// Space: O(1)