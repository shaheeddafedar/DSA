package chat_problems.Search_on_answer_chat;

public class shipWithinDays {
    public static void main(String[] args) {
        
    }

    public int shipWithinDayss(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for (int i = 0; i < weights.length; i++) {
            low = Math.max(low, weights[i]);
            high += weights[i];
        }
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canholdcapacity(weights, mid, days)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static boolean canholdcapacity(int[] weights, int mid, int days) {
        int day = 1;
        int hold = 0;
        for (int i = 0; i < weights.length; i++) {
            if (hold + weights[i] <= mid) {
                hold += weights[i];
            } else {
                day++;
                hold = weights[i];
            }
        }
        if (day > days) {
            return false;
        }
        return true;

    }

    // time O(nlogS)
    // space O(1)
}


// Brute-force 
// class Solution {
//     public int shipWithinDays(int[] weights, int days) {
//         int low = 0;
//         int high = 0;

//         for (int w : weights) {
//             low = Math.max(low, w);
//             high += w;
//         }

//         for (int capacity = low; capacity <= high; capacity++) {
//             if (canShip(weights, capacity, days)) {
//                 return capacity;
//             }
//         }

//         return -1;
//     }

//     public boolean canShip(int[] weights, int capacity, int days) {
//         int day = 1;
//         int hold = 0;

//         for (int w : weights) {
//             if (hold + w <= capacity) {
//                 hold += w;
//             } else {
//                 day++;
//                 hold = w;
//             }
//         }

//         return day <= days;
//     }
// }
// Time: O(nS)
// Space: O(1).