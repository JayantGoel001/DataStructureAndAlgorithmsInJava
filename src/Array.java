import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[5];
        for (int i=0;i<ar.length;i++){
            ar[i] = sc.nextInt();
        }
        for (int num:ar) {
            System.out.println(num);
        }
        System.out.println(Arrays.toString(ar));
    }
}
