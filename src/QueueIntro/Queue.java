package QueueIntro;

public class Queue<T> {
    protected T[] ar;
    protected int end;

    Queue(){
        int DEFAULT_SIZE = 10;
        ar =(T[]) new Object[DEFAULT_SIZE];
        end  =-1;
    }

    Queue(int size){
        ar = (T[]) new Object[size];
        end = -1;
    }

    public void add(T ele){
        if (isFull()){
            System.out.println("Queue is full");
            return;
        }
        this.ar[++end] = ele;
    }

    private boolean isFull() {
        return end==this.ar.length-1;
    }
    private boolean isEmpty() {
        return end==-1;
    }

    T peek(){
        if (isEmpty()){
            return null;
        }
        return ar[0];
    }

    void remove(){

        if (isEmpty()){
            return;
        }
        for (int i = 0; i < end; i++) {
            this.ar[i] = this.ar[i+1];
        }
        end--;
    }
    int size(){
        return end+1;
    }
}
