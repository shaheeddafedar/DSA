package Pattern_Matching;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 4;
        first_P(n);

    }

    public static void first_P(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
