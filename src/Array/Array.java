package Array;

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
        System.out.println(linearSearch(ar,5));
        Arrays.sort(ar);
        System.out.println(binarySearch(ar,5));
        System.out.println(maxElementIndex(ar));
    }
    public static int linearSearch(int[] ar, int key){
        for (int i=0;i<ar.length;i++){
            if (ar[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] ar,int key){

        int start = 0;
        int end = ar.length -1;
        while (start<=end){
            int mid = (start+end)/2;
            if(ar[mid]==key){
                return mid;
            }
            else if(ar[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static int maxElementIndex(int []ar){
        int index=0;
        int maxEle = ar[0];
        for (int i=0;i<ar.length;i++){
            if(ar[i]>maxEle){
                maxEle  = ar[i];
                index = i;
            }
        }
        return index;
    }


}
