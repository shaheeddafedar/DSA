package DSA_180.BinarySearch.Binary_Search;

public class search2DMatrix_2 {
    public static void main(String[] args) {
        
    }
public static boolean searchMatrix(int [][]matrix, int traget){
          for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0]<=traget && traget<=matrix[i][matrix[i].length-1]) {
                if (Binary_Search(matrix[i],traget)) {
                    return true;
                } 
            }
          }
        return false;
    }
    public static boolean Binary_Search(int []arr,int target){
        int low = 0;
        int high=arr.length-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]==target) {
                return true;
            }
            if (target>arr[mid]) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
}

//     Time :O(n)+O(logn)
//     Space:O(1)

//       Brute force
//     public boolean searchMatrix(int[][] matrix, int target) {
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                 if (matrix[i][j] == target) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// Time complexity:O(m×n)
// Space complexity: O(1)

