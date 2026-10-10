package DSA_180.BinarySearch.Binary_Search;

public class find_single {
    public static void main(String[] args) {
        int [] arr={1,1,2,2,3,4,4,5,5,6,6};
        int Result= findsingle(arr);
        System.out.println(Result);
        
    }
    public static int findsingle(int [] arr){
        if (arr[0]!=arr[1]) {
            return arr[0];
        }

        if (arr[arr.length-1]!=arr[arr.length-2]) {
            return arr[arr.length-1];
        }
        int low = 1;
        int high = arr.length-2;
        while (low<=high) {
            int mid =(low+high)/2;
            if (arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) {
             return  arr[mid];   
            }
            if ((mid%2!=0 && arr[mid]==arr[mid-1]) || (mid%2==0 && arr[mid]==arr[mid+1])) {
                low=mid+1;
            } else{
                high=mid-1;
            }
        }
        return -1;

    }
    
}
// Time:O(n log n)
// space:O(1)


// public static  int findsingle(int [] arr){
//         for (int i = 0; i < arr.length; i++) {
//             if (i==0) {
//                 if (arr[i]!=arr[i+1]) {
//                     return arr[i];
//                 }
//             } else if (i==arr.length-1) {
//                 if (arr[i]!=arr[arr.length-2]) {
//                     return arr[i];
//                 }
//             } else{
//                 if (arr[i]!=arr[i-1] && arr[i]!=arr[i+1]) {
//                     return arr[i];
//                 }
//             }
//         }
//         return -1;
//     }
// Time :O(n)
// Space:O(1)