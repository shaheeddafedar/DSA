package DSA_180.BinarySearch.Search_on_answer;

public class matrix_median {
    public static void main(String[] args) {

    int[][] matrix = {
        {1, 3, 5},
        {2, 6, 9},
        {3, 6, 9}
    };

    System.out.println(findMedian(matrix));
        
    }

    public static int findMedian(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;

    int low = matrix[0][0];
    int high = matrix[0][cols - 1];
    for (int i = 0; i < rows; i++) {
        low = Math.min(low, matrix[i][0]);
        high = Math.max(high, matrix[i][cols - 1]);
    }
    
    int required = (rows * cols) / 2;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            count += countLessEqual(matrix[i], mid);
        }

        if (count <= required) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return low;
}

public static int countLessEqual(int[] arr, int target) {
    int count = 0;

    for (int num : arr) {
        if (num <= target) {
            count++;
        } else {
            break; 
        }
    }

    return count;
}
    
}

// Time :O(nmlogR)
// Space :O(1)



//Brute froce
    // public static int findMedian(int[][] matrix) {
    //     int rows = matrix.length;
    //     int cols = matrix[0].length;
    //     int n = rows * cols;
    //     int[] arr = new int[n];
    //     int index = 0;
    //     for (int i = 0; i < rows; i++) {
    //         for (int j = 0; j < cols; j++) {
    //             arr[index] = matrix[i][j];
    //             index++;
    //         }
    //     }
    //     Arrays.sort(arr);
    //     return arr[n / 2];
    // }


// time:O(N log N)
// space:O(N)