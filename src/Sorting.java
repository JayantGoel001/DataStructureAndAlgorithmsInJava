import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] ar = {1,5,3,81,8,28,1267,23};
        bubbleSort(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void bubbleSort(int[] ar){
        for(int i=0;i<ar.length;i++){
            for (int j=i+1;j<ar.length-1-i;j++){
                if(ar[j]>ar[j+1]){
                    swap(ar[j],ar[j+1]);
                }
            }
        }
    }
    public static void swap(int x,int y){
        x = x+y;
        y = x-y;
        x = x-y;
    }
}
