package Sorting.Sorting_2;

import java.util.ArrayList;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4, 1, 5, 2, 6, 4 };
        MergeSort(arr, 0, arr.length - 1);
        for (int num : arr) { 
            System.out.print(num + " ");
        }
    }

    public static int [] MergeSort(int arr[], int low, int high) {
        if (low >= high) {
            return arr;
        }
        int mid = (low + high) / 2;
        MergeSort(arr, low, mid);
        MergeSort(arr, mid + 1, high);
        Merge(arr, low, mid, high);
        return arr;
    }

    public static void Merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
