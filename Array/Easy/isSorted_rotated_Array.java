// Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

// There may be duplicates in the original array.

package Array.Easy;

public class isSorted_rotated_Array {
    public static void main(String[] args) {
         int[] arr = { 3,4,5,1,2 };
         boolean result = isSorted_rotated(arr);
         if (result) {
            System.out.println("The Array is sorted :");
         } else{
            System.out.println("The Array is not in a  sorted :");
         }
    }

    public static boolean isSorted_rotated(int [] arrs){
        int drop=0;
        boolean isSorted=false;
        int firstelemt= arrs[0];
        int lastelement = arrs[arrs.length-1];

        for (int i = 0; i < arrs.length-1; i++) {
            if (arrs[i]>arrs[i+1]) {
                drop++;
            } 
        }
        if (lastelement>firstelemt) {
                drop++;
            }
        if (drop<=1) {
            isSorted=true;
        }
        return isSorted ;
    }

}

// Time complexity O(n);
// Space complexity O(1);