import java.util.ArrayList;

public class ArrayEqualSum {
    public static void main(String[] args) {
        int[] ar = {1,2,4,7,2,1,8,6,1,7};
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        equalSum(ar,arrayList1,arrayList2,0,0,0);

    }

    public static void equalSum(int[] ar,ArrayList<Integer> arrayList1,ArrayList<Integer> arrayList2,int fsum,int ssum,int index){
        if (index==ar.length){
            if (fsum == ssum){
                System.out.println(arrayList1);
                System.out.println(arrayList2);
            }
            return;
        }

        int item = ar[index];

        arrayList1.add(item);
        equalSum(ar,arrayList1,arrayList2,fsum+item,ssum,index+1);
        arrayList1.remove(arrayList1.size()-1);

        arrayList2.add(item);
        equalSum(ar,arrayList1,arrayList2,fsum,ssum+item,index+1);
        arrayList2.remove(item);
    }
}
