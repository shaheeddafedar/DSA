package Pattern_Matching;

public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
        pattern12(n);
    }

    public static void pattern12(int n) {
        int startspace = 2 *( n - 1);
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }

            // space
            for (int k = 1; k <=startspace; k++) {
                System.out.print(" ");

            }

            for (int j2 = i; j2>=1; j2--) {
                System.out.print(j2);
            }
            System.out.println();
            startspace-=2;
        }
    }
}
