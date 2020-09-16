package QueueIntro;

public class DynamicCircularQueue<T> extends CircularQueue<T> {
    @Override
    public void add(T ele) {
        if(isFull()){
            T[] temp  = (T[])new Object[2*ar.length];
            System.arraycopy(ar, 0, temp, 0, ar.length);
            this.ar = temp;
        }
        super.add(ele);
    }
}
