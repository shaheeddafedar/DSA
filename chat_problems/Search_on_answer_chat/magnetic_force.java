// Magnetic Force Between Two Balls — Easy Problem Definition
// You are given an array position, where each element represents a basket's position, and an integer m, representing the number of balls you need to place.
// Your task is to place the m balls into different baskets so that the minimum distance between any two balls is as large as possible.
// Rules:
// Each basket can hold only one ball.
// You must place exactly m balls.
// Maximize the minimum distance between any two placed balls.
// Example
// java
// position = [1, 2, 3, 4, 7]
// m = 3
// Place the balls at positions 1, 4, and 7.
// Distance between 1 and 4 = 3
// Distance between 4 and 7 = 3
// Distance between 1 and 7 = 6
// The minimum distance is 3, which is the maximum possible.
// Output: 3
// In one sentence
// Find the largest possible minimum distance between any two balls placed in different baskets.

package chat_problems.Search_on_answer_chat;
import java.util.Arrays;

// Maximum feasible
public class magnetic_force {
    public static void main(String[] args) {
        
    }

       public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int low = 1;
        int high = position[n - 1] - position[0];
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canplacedistance(position, mid, m)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static boolean canplacedistance(int[] post, int mid, int m) {
        int ball = 1;
        int lastdistance = post[0];
        for (int i = 1; i < post.length; i++) {
            if (post[i] - lastdistance >= mid) {
                ball++;
                lastdistance = post[i];
            }
        }
        if (ball >= m) {
            return true;
        }
        return false;
    }
}
// Time: O(nlogn+nlogR)
// space:O(log n )

//Brute Force
//  public int maxDistance(int[] position, int m) {
//         Arrays.sort(position);

//         int n = position.length;
//         int high = position[n - 1] - position[0];
//         int ans = 1;

//         for (int distance = 1; distance <= high; distance++) {
//             if (canPlace(position, distance, m)) {
//                 ans = distance;
//             } else {
//                 // Larger distances will also be impossible
//                 break;
//             }
//         }

//         return ans;
//     }

//     public boolean canPlace(int[] position, int distance, int m) {
//         int balls = 1;
//         int lastPosition = position[0];

//         for (int i = 1; i < position.length; i++) {
//             if (position[i] - lastPosition >= distance) {
//                 balls++;
//                 lastPosition = position[i];
//             }
//         }

//         return balls >= m;
//     }
    // Time:O(nlogn+nR)
    // space:O(log n )