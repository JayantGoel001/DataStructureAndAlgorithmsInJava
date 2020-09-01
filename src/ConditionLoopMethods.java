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
    }
}
