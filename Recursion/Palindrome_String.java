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
