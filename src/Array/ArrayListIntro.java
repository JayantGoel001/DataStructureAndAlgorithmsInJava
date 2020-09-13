package Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i*2+7*i*i);
        }
        System.out.println(arrayList);
        Collections.sort(arrayList);
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(1);
        arrayList1.add("HEllo");
        arrayList1.add('a');
        arrayList1.add(1.0056);
        System.out.println(arrayList1);

    }
}
