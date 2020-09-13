package StackIntro;

public class DynamicStack<T> extends Stack<T>{
    @Override
    public void push(T ele) {
        if(isFull()){
            T[] temp =(T[]) new Object[2* ar.length];
            System.arraycopy(ar, 0, temp, 0, ar.length);
            ar = temp;
        }
        super.push(ele);
    }
}
