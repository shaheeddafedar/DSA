package DSA_180.BinarySearch.Binary_Search;



public class rotated_sorte_array {
    public static void main(String[] args) {
        int [] arr ={4,5,6,7,0,1,2};
        int result = search(arr, 0);
        System.out.println(result);
        
    }
    public  static  int search(int[] arr, int target) {
        int low =0;
        int high = arr.length-1;
        while (low<=high) {
            int mid =(low+high)/2;
        if (arr[mid]==target) {
            return mid;
        }
            if (arr[low]<=arr[mid] ) {
                if (arr[low]<=target && target<arr[mid])  {
                    high=mid-1;
                } else{
                    low=mid+1;
                }
            } else{
                if (arr[mid]<target && target<=arr[high]) {
                    low=mid+1;
                } else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
// time :O(n log n);
// space :O(1);


// Brute Force 
// public static int search(int[] arr, int target) {

//     for (int i = 0; i < arr.length; i++) {
//         if (arr[i] == target) {
//             return i;
//         }
//     }

//     return -1;
// }
// Time:  O(n)
// Space: O(1)
