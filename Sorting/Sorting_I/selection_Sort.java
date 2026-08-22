package Sorting.Sorting_I;

public class selection_Sort {
    public static void main(String[] args) {
        int [] arr={13,46,24,52,20,9};
        int [] reuslt = selectionSort(arr);
        for (int i = 0; i < reuslt.length; i++) {
            System.out.println(+reuslt[i]);
        }
    }

    public static int[] selectionSort(int[] nums) {

        for (int i = 0; i <nums.length-1; i++) {
            int mini =i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j]<nums[mini]) {
                mini=j;
                }
            }
            swap(nums, mini,i);
        }
        return nums;
    }
    public static void swap( int arr[],int mini,int i){
        int temp = arr[mini];
        arr[mini]=arr[i];
        arr[i]=temp;
    } 
}



// Time Complexity = O(N²)
// Space Complexity = O(1)