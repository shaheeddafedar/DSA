// Check if String is Palindrome or Not
// Given a string s, return true if the string is palindrome, otherwise false.
// A string is called palindrome if it reads the same forward and backward.


package Recursion;

public class Palindrome_String {
    public static void main(String[] args) {
        String name = "mom";
        if (check_palindrome(0, name)) {
            System.out.println("The given String is palindrome");
        } else {
            System.out.println("The given String is Not a palindrome");
        }
    }

    public static boolean check_palindrome(int i, String str) {
        if (i >= str.length() / 2) {
            return true;
        }
        if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
            return false;
        }
        return check_palindrome(i + 1, str);
    }
}


// Time  → O(n)
// Space → O(n)


// class Solution {

// public boolean isPalindrome(String s) {
//     return check_palindrome(0, s.length() - 1, s);
// }

// public static boolean check_palindrome(int i, int j, String str) {

//     if (i >= j) {
//         return true;
//     }

//     if (!Character.isLetterOrDigit(str.charAt(i))) {
//         return check_palindrome(i + 1, j, str);
//     }

//     if (!Character.isLetterOrDigit(str.charAt(j))) {
//         return check_palindrome(i, j - 1, str);
//     }

//     if (Character.toLowerCase(str.charAt(i)) !=
//         Character.toLowerCase(str.charAt(j))) {
//         return false;
//     }

//     return check_palindrome(i + 1, j - 1, str);
// }


// } 