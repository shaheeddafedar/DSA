// Ship Within D Days — Easy Problem Definition
// You are given an array weights, where each element represents the weight of a package. You must ship all packages in exactly or at most days days using a ship with a fixed capacity.
// Rules:
// Packages must be shipped in the given order.
// You cannot exceed the ship's weight capacity on any day.
// You must find the minimum ship capacity that allows you to ship all packages within the given number of days.
// Example
// weights = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
// days = 5
// One possible arrangement is:
// Day 1: [1, 2, 3, 4] → total 10
// Day 2: [5, 6] → total 11
// Day 3: [7] → total 7
// Day 4: [8] → total 8
// Day 5: [9] → total 9
// A capacity of 11 works, and the minimum possible capacity is 15 (so the arrangement above is not valid for capacity 11 because Day 2 totals 11, but the subsequent days also need to fit within the chosen capacity; in fact, capacity 15 is the answer).




package chat_problems.Search_on_answer_chat;

// Minimum feasible
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