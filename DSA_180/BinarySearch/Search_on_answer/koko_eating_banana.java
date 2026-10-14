package DSA_180.BinarySearch.Search_on_answer;

public class koko_eating_banana {
    public static void main(String[] args) {
        
    }
    public  static  int minEatingSpeed(int[] piles, int h) {
        int max =0;
        for(int pile : piles){
            max=Math.max(max, pile);
        }
        int low =1;
        int high=max;
        int ans =max;
        while (low<=high) {
            int mid =(low+high)/2;
            long hours=0;
            for (int pile : piles) {
                hours+=(pile+(long)+mid-1)/mid;
            }
            if (hours<=h) {
                high=mid-1;
                ans=mid;
            } else {
                low=mid+1;
            }
        }   
        return ans;
    }
}
// Time Complexity: O(n log m)
// Space Complexity: O(1)

// Brute
// public int minEatingSpeed(int[] piles, int h) {
//            int max =0;
//         for (int pile : piles) {
//             max=Math.max(max, pile);
//         }
//         for (int i = 1; i <=max; i++) {
//             int hours =0;
//            for (int pile : piles) {
//             hours += (pile + i - 1) / i;
//            }

//            if (hours<=h) {
//             return i;
//            }
//         }
//         return max;
//     }
// Time Complexity: O(n×M)
// Space Complexity: O(1)