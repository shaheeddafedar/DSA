// Given an integer array nums sorted in non-decreasing order, remove all duplicates in-place so that each unique element appears only once.
// Return the number of unique elements in the array.
package Array.Easy;

public class Remove_duplicates {
    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 3, 5, 6 };
        int result = Remove_duplicate(arr);
        System.out.println("The Lenght of Unique element is : "+ result);
          for (int k = 0; k < result; k++) {
            System.out.println(arr[k]);
        }
    }

    public static int Remove_duplicate(int[] arrs) {
        int i=0;
        for (int j =1; j < arrs.length; j++) {
            if (arrs[i] != arrs[j]) {
                arrs[i + 1] = arrs[j];
                i++;
            }
        }
           
        return i+1;
        
    }
}

// Time complexity O(n);
// Space complexity O(1);