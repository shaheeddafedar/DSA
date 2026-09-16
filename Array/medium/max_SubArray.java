package Array.medium;

public class max_SubArray {
    public static void main(String[] args) {
        int [] arr ={2, 3, 5, -2, 7, -4};
        int result=maxSubArray(arr);
        System.out.println("The maxSubarray sum is : "+result);
        
    }
        public static  int maxSubArray(int[] arr) {
        int sum=0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if (sum>max) {
                max=sum;
            }
            if (sum<0) {
                sum=0;
            }
        }
        return max;
    }
}

// Time: O(n)
// Space: O(1)




// public static void maxSubArray(int[] nums) {
//     int sum = 0;
//     int max = Integer.MIN_VALUE;

//     int start = 0;
//     int end = 0;
//     int tempStart = 0;

//     for (int i = 0; i < nums.length; i++) {

//         if (sum == 0) {
//             tempStart = i;
//         }

//         sum += nums[i];

//         if (sum > max) {
//             max = sum;
//             start = tempStart;
//             end = i;
//         }

//         if (sum < 0) {
//             sum = 0;
//         }
//     }

//     System.out.println("Maximum Sum = " + max);

//     System.out.print("Maximum Subarray = [");
//     for (int i = start; i <= end; i++) {
//         System.out.print(nums[i]);

//         if (i < end) {
//             System.out.print(", ");
//         }
//     }
//     System.out.println("]");
// }
