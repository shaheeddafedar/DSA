package Pattern_Matching;

public class Pattern20 {
    public static void main(String[] args) {
        int n = 5;
        pattern20(n);
        backward(n);
    }

    public static void pattern20(int n) {
        int spaces = (2 * n) - 2;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }

            for (int j2 = 0; j2 <= i; j2++) {
                System.out.print("*");
            }

            System.out.println();
            spaces -= 2;
        }
    }

    public static void backward(int n) {
        int spaces = 2;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j <= n - 2 - i; j++) {
                System.out.print("*");
            }

            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }

            for (int j2 = 0; j2 <= n - 2 - i; j2++) {
                System.out.print("*");
            }

            System.out.println();
            spaces += 2;
        }
    }
}