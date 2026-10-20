package DSA_180.BinarySearch.Partition_Search;

public class kth_2array {
    public static void main(String[] args) {
        int[] nums1 = { 2, 3, 6, 7, 9 };
        int[] nums2 = { 1, 4, 8, 10 };
        int k = 5;
        int result=kthElement(nums1, nums2, k);
        System.out.println(result);

    }

    public static int kthElement(int[] nums1, int[] nums2, int k) {

        if (nums1.length > nums2.length) {
            return kthElement(nums2, nums1, k);
        }

        int m = nums1.length;
        int n = nums2.length;

        // k is 1-based
        if (k < 1 || k > m + n) {
            return -1;
        }

        int low = Math.max(0, k - n);
        int high = Math.min(k, m);

        while (low <= high) {

            int mid1 = (low + high) / 2;
            int mid2 = k - mid1;

            int left1 = (mid1 == 0)
                    ? Integer.MIN_VALUE
                    : nums1[mid1 - 1];

            int right1 = (mid1 == m)
                    ? Integer.MAX_VALUE
                    : nums1[mid1];

            int left2 = (mid2 == 0)
                    ? Integer.MIN_VALUE
                    : nums2[mid2 - 1];

            int right2 = (mid2 == n)
                    ? Integer.MAX_VALUE
                    : nums2[mid2];

            if (left1 <= right2 && left2 <= right1) {
                return Math.max(left1, left2);
            } else if (left1 > right2) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }

        return -1;
    }

}
// Time: (O(log(min(m,n))))
// Space:O(1)



//Brute Force
    // public double findMedianSortedArrays(int[] arr1, int[] arr2,int k) {
    //     int m = arr1.length;
    //     int n = arr2.length;
    //     int[] merged = new int[m + n];
    //     for (int i = 0; i < m; i++) {
    //         merged[i] = arr1[i];
    //     }

    //     for (int i = 0; i < n; i++) {
    //         merged[m + i] = arr2[i];
    //     }

    //     Arrays.sort(merged);

    //     return merged[k-1];
    // }

// Time:O(NlogN)
// Space: O(N)


//Better
//  public double findMedianSortedArrays(int[] nums1, int[] nums2,int f) {
//          int m = nums1.length;
//         int n = nums2.length;
//         int[] merged = new int[m + n];
//         int i = 0; 
//         int j = 0; 
//         int k = 0; 
//         while (i < m && j < n) {
//             if (nums1[i] <= nums2[j]) {
//                 merged[k++] = nums1[i++];
//             } else {
//                 merged[k++] = nums2[j++];
//             }
//         }
//         while (i < m) {
//             merged[k++] = nums1[i++];
//         }

//         while (j < n) {
//             merged[k++] = nums2[j++];
//         }

//        return merged[f-1];
//     }

// Time: O(m+n)
// Space:O(m+n)