import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] ar = {1,5,3,81,8,28,1267,23};
        bubbleSort(ar);
        System.out.println(Arrays.toString(ar));
        int[] ar2 = {1,5,3,81,8,28,1267,23};
        selectionSort(ar2);
        System.out.println(Arrays.toString(ar2));
    }

    public static void bubbleSort(int[] ar){
        for(int i=0;i<ar.length;i++){
            for (int j=0;j<ar.length-1-i;j++){
                if(ar[j]>ar[j+1]){
                    ar[j] = ar[j] + ar[j+1];
                    ar[j+1] = ar[j] - ar[j+1];
                    ar[j] = ar[j] - ar[j+1];
                }
            }
        }
    }

    public static void selectionSort(int []ar){
        for(int i=0;i<ar.length;i++){
            int minEle = ar[i];
            int p = i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[j]<minEle){
                    minEle = ar[j];
                    p = j;
                }
            }
            if(p!=i){
                int temp = ar[i];
                ar[i] = ar[p];
                ar[p] = temp;
            }
        }
    }
}
