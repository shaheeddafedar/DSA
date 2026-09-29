package DSA_180.Arrays.Divide_and_Conquer;

import java.util.ArrayList;
import java.util.List;

public class reverse_Pairs {
    public static void main(String[] args) {
          int[] arr = {2, 3, 7, 1, 3, 5};

        System.out.println(reversePairs(arr));
    }
     public static int reversePairs(int[] arr) {
        return merger_sort(arr, 0, arr.length-1);
     
    }

    public static int merger_sort(int [] arr, int low,int high){
        int count =0;
        if (low>=high) {
            return 0;
        }
       int mid = (low+high)/2;
    count += merger_sort(arr, low, mid);
    count += merger_sort(arr, mid + 1, high);
    count+=count_pairs(arr, low, mid, high);
     merger(arr, low, mid, high);

        return count;
    }
    public  static  void merger(int [] arr, int low,int mid,int high){
        List<Integer> ls = new ArrayList<>();
        int left=low;
        int right=mid+1;
        while (left<=mid && right<=high) {
            if (arr[left]<=arr[right]) {
                ls.add(arr[left]);
                left++;
            }else{
                ls.add(arr[right]);
                right++;
            }
        }
        while (left<=mid) {
            ls.add(arr[left]);
            left++;
        }
        while (right<=high) {
            ls.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
                arr[i]=ls.get(i-low);
            }
    }
    public  static  int count_pairs(int []arr, int low, int mid,int high){
        int count =0;
        int right=mid+1;
        for (int i = low; i <=mid; i++) {
            while (right<=high && arr[i]>2L*arr[right]) {
                right++;
                count+=(right-(mid+1));
            }
        }
        return count;
    }
}



//Brute Force
//  public static int reversePairs(int[] arr) {
//         int count=0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 if (arr[i]>2*arr[j]) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// Time: O(n²)
// Space: O(1)