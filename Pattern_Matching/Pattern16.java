package Pattern_Matching;

public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;
        pattern16(n);
    }

    public static void pattern16(int n) {
        char firstchar ='A';
        for (int i = 0; i <n; i++) {
    // char firstchar = (char) ('A' + i); or solution
            for (int j = 0; j <=i; j++) {
            System.out.print(firstchar);
        }
         firstchar+=1;

            System.out.println();
        }
    }

}
