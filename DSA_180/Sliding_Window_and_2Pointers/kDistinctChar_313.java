package DSA_180.Sliding_Window_and_2Pointers;

public class kDistinctChar_313 {
    public static void main(String[] args) {
        
    }
}


// Brute force
//     public int kDistinctChar(String s, int k) {
//         int n = s.length();
//         int maxlen = 0;

//         for (int i = 0; i < n; i++) {
//             HashMap<Character, Integer> map = new HashMap<>();

//             for (int j = i; j < n; j++) {
//                 char ch = s.charAt(j);

//                 map.put(ch, map.getOrDefault(ch, 0) + 1);

//                 if (map.size() <= k) {
//                     maxlen = Math.max(maxlen, j - i + 1);
//                 } else {
//                     break;
//                 }
//             }
//         }

//         return maxlen;
//     }
//     Time :O(N^2);
//     Space :O(1)  