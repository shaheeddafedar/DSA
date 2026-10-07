// Given two integer arrays nums1 and nums2. Both arrays are sorted in non-decreasing order.
// Merge both the arrays into a single array sorted in non-decreasing order.
// The final sorted array should be stored inside the array nums1 and it should be done in-place.
// nums1 has a length of m + n, where the first m elements denote the elements of nums1 and rest are 0s.
// nums2 has a length of n.
// Example 1:
// Input: nums1 = [-5, -2, 4, 5], nums2 = [-3, 1, 8]
// Output: [-5, -3, -2, 1, 4, 5, 8]


package DSA_180.Arrays.Two_Pointer;

public class merge_two_array {
    public static void main(String[] args) {
        int[] arr1 = { 1,2,3,0,0,0};
        int[] arr2 = { 2,5,6};
        int n = arr2.length;
        int m = arr1.length - n;
        merge(arr1, m, arr2, n);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    public static void merge(int[] arrs1, int m, int[] arrs2, int n) {
        int index =(m+n)-1;
        int i =m-1;
        int j =n-1;

        while (i>=0 && j>=0) {
            if (arrs1[i]>arrs2[j]) {
                arrs1[index]=arrs1[i];
                index--;
                i--;
            } else{
                arrs1[index]=arrs2[j];
                index--;
                j--;
            }
        }
        while (j>=0) {
            arrs1[index]=arrs2[j];
            index--;
            j--;
        }
    }
}
// Time  → O(m + n)
// Space → O(1)


// Brute Force
//   public static void merge(int[] arrs1, int m, int[] arrs2, int n) {
//         int left = 0;
//         int rigth = 0;
//         int[] arr3 = new int[m + n];
//         int index = 0;
//         while (left < m && rigth < n) {
//             if (arrs1[left] < arrs2[rigth]) {
//                 arr3[index] = arrs1[left];
//                 left++;
//                 index++;
//             } else {
//                 arr3[index] = arrs2[rigth];
//                 rigth++;
//                 index++;
//             }
//         }
//         while (left < m) {
//             arr3[index] = arrs1[left];
//             left++;
//             index++;
//         }
//         while (rigth < n) {
//             arr3[index] = arrs2[rigth];
//             rigth++;
//             index++;
//         }
//         for (int i = 0; i < m + n; i++) {
//             arrs1[i] = arr3[i];
//         }
//     }

// Time: O((m+n) log(m+n))
// Space: O(m+n)