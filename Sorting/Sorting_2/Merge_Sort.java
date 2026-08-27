package Sorting.Sorting_2;

import java.util.ArrayList;
import java.util.List;

import Basic_Math.partice;
import hi.hi;

public class Merge_Sort {
    public static void main(String[] args) {
        int [] arr = {3,1,2,4,1,5,2,6,4};
    MergeSort(arr, 0, arr.length-1);
    
}
    public static void MergeSort(int arr[],int low,int high){
        if (low>=high) {
            return;
        }
        int mid = (low+high)/2;
        MergeSort(arr,low,mid);
        MergeSort(arr,mid+1, high);
        Merge(arr,low,mid,high);
    }

    public static void Merge(int arr[],int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int left = low;
        int right = mid+1;
        while (left<=mid && right<=high) {
            if (arr[left]<=arr[right]) {
                temp.add(arr[left]);
                left++;
            } else{
                temp.add(arr[right]);
                right++;
            }
        }
        System.out.println(temp);
    }
}
