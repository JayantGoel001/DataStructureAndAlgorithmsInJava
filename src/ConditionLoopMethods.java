import java.util.Scanner;

public class ConditionLoopMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("Leap Year");
        } else {
            System.out.println("Ordinary Year");
        }

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(i);
            i+=Math.random()*10;
        }
        if(prime(n)) {
            System.out.println("Prime Number");
        }else {
            System.out.println("Not A Prime Number");
        }
    }

    private static boolean prime(int n) {
        boolean[] ar = new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(!ar[i]) {
                for (int j = i * i; j <= n; j += i) {
                    ar[j] = true;
                }
            }
        }

        return !ar[n];
    }


}
