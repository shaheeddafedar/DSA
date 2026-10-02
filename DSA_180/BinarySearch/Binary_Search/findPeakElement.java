package DSA_180.BinarySearch.Binary_Search;

public class findPeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
        int result = findPeakElements(arr);
        System.out.println(result);
        
    }
        public static  int findPeakElements(int[] arr) {
          int low = 0;
          int high = arr.length-1;
          while (low<high) {
            int mid = (low+high)/2;
            if (arr[mid]<arr[mid+1]) {
                low=mid+1;
            } else {
                high=mid;
            }
          }
          return low;
    }
}
// Time :O(nlogn);
// space:O(1);

//Brute 
// public static  int findPeakElements(int[] arr) {
//             for (int i = 0; i < arr.length; i++) {
//                 if ((i==0 || arr[i-1]<arr[i]) && (i==arr.length-1 || arr[i]>arr[i+1])) {
//                     return arr[i];
//                 }
//             }
//             return -1;
//     }
    // Time :O(n);
    // Space :O(1);


