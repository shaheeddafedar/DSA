package DSA_180.Arrays.Two_Pointer;

public class trapping_Rainwater {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int result = trap(arr);
        System.out.println("The Total Water  is : " + result);
        
    }
        public static  int trap(int[] height) {
          int ans =0;
          int l =0;
          int r=height.length-1;
          int leftmax=0;;
          int rigthmax=0;
          while (l<r) {
            leftmax=Math.max(leftmax, height[l]);
            rigthmax=Math.max(rigthmax, height[r]);

            if (leftmax<rigthmax) {
                ans+=leftmax-height[l];
                l++;
            } else{
                ans+=rigthmax-height[r];
            }
          }
      return ans;
    }
}
// Time  → O(n)
// Space → O(1)




// Brute Force
// public static  int trap(int[] height) {
//        int totalwater =0;
//        for (int i = 0; i < height.length; i++) {
//         int leftmax =0;
//         for (int j = 0; j <=i; j++) {
//             leftmax=Math.max(leftmax, height[j]);
//         }
//         int rigthmax =0;
//         for (int j2 = i; j2 <height.length; j2++) {
//              rigthmax=Math.max(rigthmax, height[j2]);
//         }
//          totalwater+=Math.min(leftmax, rigthmax)-height[i];
//          
//        }
//        return totalwater;
//     }
// Time: O(n²)
// Space: O(1)


// Better
// public static  int trap(int[] height) {
//             int ans=0;
//           int n = height.length;
//           int [] leftmax= new int[n];
//           int [] rigthmax= new  int [n];

//           leftmax[0]=height[0];
//           rigthmax[n-1]=height[n-1];
//           for (int i = 1; i <n; i++) {
//             leftmax[i]=Math.max(leftmax[i-1], height[i]);
//           }
//           for (int j=n-2;j>=0; j--) {
//             rigthmax[j]=Math.max(rigthmax[j+1], height[j]);
//           }
//           for (int i = 0; i <n; i++) {
//             ans+=Math.min(leftmax[i], rigthmax[i])-height[i];
//           }
//       return ans;
//     }
// Time: O(n)
// Space: O(n)