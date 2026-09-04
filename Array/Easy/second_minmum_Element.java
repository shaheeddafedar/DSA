package Array.Easy;

public class second_minmum_Element {
    public static void main(String[] args) {
         int[] arr = { 10, 5, 8, 20, 15 };
        int result = second_minmum(arr);
        System.out.println("The Second minimum Value is : "+result);
    }
    public static int second_minmum(int [] arr){
        int first_Mini=arr[0];
        int second_Mini =  Integer.MAX_VALUE;
        boolean foundSecondMini= false;
        for (int i = 0; i < arr.length; i++) {
            if (first_Mini>arr[i]) {
                second_Mini=first_Mini;
                first_Mini=arr[i];
                foundSecondMini=true;
            } else if (first_Mini<arr[i] && arr[i]<second_Mini) {
                second_Mini=arr[i];
            }
        }
        if (!foundSecondMini) {
            return -1;
        }
        return second_Mini;
    }
}
// Time complexity O(n);
// Space complexity O(1);