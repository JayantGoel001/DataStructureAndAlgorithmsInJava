public class Recursion {
    public static void main(String[] args) {
        print(5);
        System.out.println();
        printInc(13);
        System.out.println();
        System.out.println(fact(5));
        int[] nums= {2,9,4,8,2,0,1};
        int key = 8;
        System.out.println(find(nums,0,key));
    }

    private static int find(int[] nums,int i,int key) {
        if (i==nums.length){
            return -1;
        }
        if (nums[i]==key){
            return i;
        }
        return find(nums,i+1,key);
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

    public static int fact(int n){
        if (n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
