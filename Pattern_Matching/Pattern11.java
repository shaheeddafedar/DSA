package Pattern_Matching;

public class Pattern11 {
    public static void main(String[] args) {
        int n=5;
      pattern11(n);
    }

    public static void pattern11(int n){
        for (int i = 0; i <=n; i++) {
           for (int j = 0; j <i; j++) {
           }
              for (int j2 = 1; j2 >=0; j2--) {
                System.out.println(j2);
            }
                       System.out.println();

        }
    }
}



