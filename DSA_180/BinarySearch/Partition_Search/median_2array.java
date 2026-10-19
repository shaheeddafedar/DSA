package DSA_180.BinarySearch.Partition_Search;

public class median_2array {
    public static void main(String[] args) {
        
    }
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int low = 0;
        int high = m;

        while (low <= high) {
            int mid1 = (low+high) / 2;
            int mid2 = (m + n + 1) / 2 - mid1;

            int left1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 - 1];

            int right1 = (mid1 == m) ? Integer.MAX_VALUE : nums1[mid1];

            int left2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];

            int right2 = (mid2 == n) ? Integer.MAX_VALUE : nums2[mid2];

            if (left1 <= right2 && left2 <= right1) {

                if ((m + n) % 2 == 1) {
                    return Math.max(left1, left2);
                }
                return ((double) Math.max(left1, left2)
                        + Math.min(right1, right2)) / 2.0;

            } else if (left1 > right2) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }

        return 0.0; 
    }
}
// Time: (O(log(min(m,n))))
// Space:O(1)



//Brute Force
    // public double findMedianSortedArrays(int[] arr1, int[] arr2) {
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

    //     int total = merged.length;

    //     if (total % 2 == 1) {
    //         return merged[total / 2];
    //     }
    //     return ((double) merged[total / 2 - 1]
    //             + merged[total / 2]) / 2.0;
    // }

// Time:O(NlogN)
// Space: O(N)


//Better
//  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
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

//         int total = m + n;

//         if (total % 2 == 1) {
//             return merged[total / 2];
//         }

//         return ((double) merged[total / 2 - 1]
//                 + merged[total / 2]) / 2.0;
//     }

// Time: O(m+n)
// Space:O(m+n)