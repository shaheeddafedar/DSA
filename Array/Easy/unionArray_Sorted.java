package Array.Easy;

import java.util.ArrayList;

public class unionArray_Sorted {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 7 };
        int[] result = unionArray(arr1, arr2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public static int[] unionArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i=0;
        int j =0;
        while (i<arr1.length && j<arr2.length ) {
            if (arr1[i]<arr2[j]) {
                if (temp.isEmpty() || temp.get(temp.size()-1)!=arr1[i]) {
                    temp.add(arr1[i]);
                }
                i++;
            } else if (arr1[i]>arr2[j]) {
                if (temp.isEmpty() || temp.get(temp.size()-1)!=arr2[j]) {
                    temp.add(arr2[j]);
                    j++;
                }
            } else{
                if (temp.isEmpty()|| temp.get(temp.size()-1)!=arr1[i]) {
                    temp.add(arr1[i]);
                    i++;
                    j++;
                }
            }
        }
        while (i<arr1.length) {
            if (temp.isEmpty()|| temp.get(temp.size()-1)!=arr1[i]) {
                temp.add(arr1[i]);
                i++;
            }
        }
               while (j<arr2.length) {
            if (temp.isEmpty()|| temp.get(temp.size()-1)!=arr2[j]) {
                temp.add(arr2[j]);
                j++;
            }
        }

        int [] result = new int [temp.size()];
        for (int k = 0; k < result.length; k++) {
            result[k]=temp.get(k);
        }
        return result;

    }

}


// Time complexity O(n + m);
// Space complexity O(n + m);

// Brute forec
// public static int[] unionArray(int[] nums1, int[] nums2) {
// TreeSet<Integer> temp = new TreeSet<>();
// for (int i = 0; i < nums1.length; i++) {
// temp.add(nums1[i]);
// }
// for (int i = 0; i < nums2.length; i++) {
// temp.add(nums2[i]);
// }
// int n = temp.size();
// int [] newarray = new int[n];

// int j = 0;
// for (int value : temp) {
// newarray[j] = value;
// j++;
// }

// return newarray;
// }
// time complexity = o(nlog n);
// Space complexity O(n);