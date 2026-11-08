// Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
// In other words, return true if one of s1's permutations is the substring of s2.
// Example 1:
// Input: s1 = "ab", s2 = "eidbaooo"
// Output: true
// Explanation: s2 contains one permutation of s1 ("ba").
// Example 2:
// Input: s1 = "ab", s2 = "eidboaoo"
// Output: false


package DSA_180.Sliding_Window_and_2Pointers;

import java.util.Arrays;

public class chat_permutation_in_string {
    public static void main(String[] args) {
        
    }
 
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()){
            return false;
        }        
        int[] freq = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
        }
        int[] window = new int[128];
        int l = 0, r = 0;
        while (r < s2.length()) {
            char ch = s2.charAt(r);
            window[ch]++;
            if (r - l + 1 > s1.length()) {
                window[s2.charAt(l)]--;
                l++;
            }
            if (r - l + 1 == s1.length()) {
                if (Arrays.equals(window, freq))
                    return true;
            }

            r++;
        }

        return false;
    }
}
// Time :O(m × 128) = O(m)
// Space :O(1);



// Brute Force 
// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         if (s1.length() > s2.length())
//             return false;
//         int[] freq = new int[128];
//         for (int i = 0; i < s1.length(); i++) {
//             freq[s1.charAt(i)]++;
//         }
//         for (int i = 0; i <= s2.length() - s1.length(); i++) {
//             int[] window = new int[128];
//             for (int j = i; j < i + s1.length(); j++) {
//                 window[s2.charAt(j)]++;
//             }
//             if (Arrays.equals(freq, window))
//                 return true;
//         }

//         return false;
//     }
// }

// Time :O(N^2) 
// Space :O(1);
