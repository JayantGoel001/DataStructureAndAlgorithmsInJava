package QueueIntro;

public class CircularQueue<T> {
    private final T[] ar;
    int front = 0;
    int end = -1;
    int size = 0;
    int DEFAULT_SIZE = 10;
    CircularQueue(){
        ar = (T[])new Object[DEFAULT_SIZE];
    }

    CircularQueue(int size){
        ar = (T[])new Object[size];
    }

    public void add(T ele) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        end = (end + 1) % ar.length;
        ar[end] = ele;
        size++;
    }

    public T peek(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return null;
        }
        return ar[front];
    }

    public void remove(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        front = (front+1)%ar.length;
        size--;
    }

    private boolean isEmpty() {
        return  size==0;
    }

    private boolean isFull() {
        return size==ar.length;
    }

}
