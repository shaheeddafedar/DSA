// Two elements a[i] and a[j] 
// form an inversion 
// if a[i] > a[j] 
// and i < j.

package DSA_180.Arrays.Divide_and_Conquer;
import java.util.ArrayList;
import java.util.List;

public class count_Inversions {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 1, 3, 5};

        System.out.println(numberOfInversions(arr));
    }
     public static  long numberOfInversions(int[] arr) {
        return merger_sort(arr, 0, arr.length-1);
      
    }
    public static long merger_sort(int [] arr, int low,int high){
        if (low>=high) {
            return 0;
        }
        int mid = (low+high)/2;

        long Leftcount = merger_sort(arr, low, mid);
        long rightcount = merger_sort(arr, mid + 1, high);
        long inerversioncount = merger(arr, low, mid, high);

        return Leftcount+rightcount+inerversioncount;
    }
    public static long merger(int []arr,int low,int mid,int high ){
        List<Integer> temp = new ArrayList<>();
        int left=low;
        int right= mid+1;
        long count =0;
        while (left<=mid && right<=high) {
            if (arr[left]<=arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
                count+= (mid - left + 1);
            }
        }
        while (left<=mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right<=high) {
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
                arr[i]=temp.get(i-low);
            }
        return   count;
        
    }
    
}
// Time  = O(n log n)
// Space = O(n)


// Brute Force
// public static  long numberOfInversions(int[] arr) {
//        int count=0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 if (arr[i]>arr[j]) {
//                   count++;
//                 }
//             }
//         }
//         return  count;
//     }

// Time: O(n²)
// Space: O(1)