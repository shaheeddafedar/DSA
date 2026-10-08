package DSA_180.BinarySearch.Binary_Search;


public class rotated_sorted_array_2 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        System.out.println("Search: " + search(arr, target));
        
    }
    public  static  boolean search(int [] arr, int target){
        int low =0;
        int high = arr.length-1;
        while (low<=high) {
            int mid =(low+high)/2;
            if (arr[mid]==target) {
                return true;
            } 
            if (arr[low]== arr[mid] && arr[mid]== arr[high]) {
                low++;
                high--;
                continue;
            }
            if (arr[low]<=arr[mid]) {
                if (arr[low]<=target && target<arr[mid]) {
                    high=mid-1;
                } else{
                    low=mid+1;
                }
            } else{
                if (arr[mid]<target && target<=arr[high]) {
                    low=mid+1;
                } else {
                    high=mid-1;
                }
            }
        }
        return false;
    }
}
// Time:(n log n)
// Space:O(1)


//bruteForce
//  public static boolean search(int[] arr, int target) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 return true;
//             }
//         }
//         return false;
//     }

// Time: O(n)
// Space: O(1)