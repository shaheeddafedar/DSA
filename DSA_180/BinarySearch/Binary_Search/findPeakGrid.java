package DSA_180.BinarySearch.Binary_Search;

public class findPeakGrid {
    public static void main(String[] args) {
         int[][] mat = {
        {10, 20, 15},
        {21, 30, 14},
        {7, 16, 32}
    };
    int[] result = findPeakGrid_2(mat);
    System.out.println("Row: " + result[0]);
    System.out.println("Column: " + result[1]);
        
    }
    public static int [] findPeakGrid_2(int [][] mat){
       int n = mat.length;
      int m = mat[0].length;
     int low = 0;
     int high = m-1;
     while(low<=high){
        int mid =(low + high)/2;
        int row =0;
        for(int i =0;i<n;i++){
            if(mat[i][mid]>mat[row][mid]){
                row=i;
            }
        }
        int left = (mid>0)?mat[row][mid-1]:-1;
        int right =(mid<m-1)?mat[row][mid+1]:-1;

        if(mat[row][mid]>left && mat[row][mid]>right){
            return new int []{row,mid};
        }
         if (left > mat[row][mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
     }
     return new int[]{-1, -1};
    }
}
	// Time: O(n log ⁡m )
	// Space: O(1)



// Brute
//  public static int [] findPeakGrid_2(int [][] mat){
//         int row =-1;
//         int col =-1;
//         int largest = Integer.MIN_VALUE;
//         for (int i = 0; i < mat.length; i++) {
//             for (int j = 0; j < mat[i].length; j++) {
//                 if (mat[i][j]>largest) {
//                     largest=mat[i][j];
//                     row=i;
//                     col=j;
//                 }
//             }
//         }
//         return new int[]{row, col};
//     }
//     Time :O(m*n)
//     Space :O(1)