// Given an integer array nums and a non-negative integer k, 
// rotate the array tothe left by k steps.
// Input: nums = [1, 2, 3, 4, 5, 6], k = 2
// Output: nums = [3, 4, 5, 6, 1, 2]


package Array.Easy;
public class Rotate_Array_by_k {
 public static void main(String[] args) {
    int [] arrs ={1, 2, 3, 4, 5, 6};
    int k =2;
    rotate_Array(arrs, k);
     
 }  
 public static void rotate_Array(int[] arr,int k){
    if (k>arr.length) {
        k=k%arr.length;
    }
    reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

 } 
 public static void reverse(int [] arr,int start,int end){
    while (start<end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
 }
}

// Time complexity O(n);
// Space complexity O(1);



// Left rotation:
// reverse(nums, 0, k - 1);
// reverse(nums, k, n - 1);
// reverse(nums, 0, n - 1);

// Right rotation:
// reverse(nums, 0, n - 1);
// reverse(nums, 0, k - 1);
// reverse(nums, k, n - 1);