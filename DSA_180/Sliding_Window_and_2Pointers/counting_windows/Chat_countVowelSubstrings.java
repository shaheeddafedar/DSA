package DSA_180.Sliding_Window_and_2Pointers.counting_windows;

import java.util.HashMap;

public class Chat_countVowelSubstrings {
    public static void main(String[] args) {
        
    }
    

    public static  int countVowelSubstrings(String word) {
        return atMost(word, 5) - atMost(word, 4);
    }
    private static  int atMost(String word, int k) {
        int count = 0;
        int l = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int r = 0; r < word.length(); r++) {
            char ch = word.charAt(r);

            if ("aeiou".indexOf(ch) == -1) {
                map.clear();
                l = r + 1;
                continue;
            }
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {
                char left = word.charAt(l);

                map.put(left, map.get(left) - 1);

                if (map.get(left) == 0) {
                    map.remove(left);
                }

                l++;
            }

            count += r - l + 1;
        }

        return count;
    }
}
// Time :O(N);
// Space:O(1);



// Brute Force
//  public int countVowelSubstrings(String word) {
//         int count = 0;
//         for (int i = 0; i < word.length(); i++) {
//             HashSet<Character> set = new HashSet<>();
//             for (int j = i; j < word.length(); j++) {
//                 char ch = word.charAt(j);
//                 if ("aeiou".indexOf(ch) == -1) {
//                     break;
//                 }
//                 set.add(ch);
//                 if (set.contains('a') && set.contains('e') &&
//                     set.contains('i') && set.contains('o') &&
//                     set.contains('u')) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// Time :O(N^2);
// Space:O(1);