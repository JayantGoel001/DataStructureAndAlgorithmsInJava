public class Recursion {
    public static void main(String[] args) {
        print(5);
        System.out.println();
        printInc(13);
    }

    private static void print(int i) {
        if (i>0) {
            System.out.println(i);
            print(i - 1);
        }
    }
    private static void printInc(int i) {
        if (i<20) {
            printInc(i + 1);
            System.out.println(i);
        }
    }
}
