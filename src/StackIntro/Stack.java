package StackIntro;

public class Stack<T> {
    protected T[] ar;
    protected int top;
    public Stack(){
        top=-1;
        ar = (T[]) new Object[10];
    }
    public Stack(int size){
        top=-1;
        ar = (T[])new Object[size];
    }
    public void push(T ele){
        if (isFull()){
            System.out.println("Stack Overflow");
            return;
        }

        ar[++top] = ele;
    }

    public boolean isFull() {
        return top== ar.length-1;
    }

    T pop(){
        if (empty()){
            System.out.println("Stack Overflow");
            return null;
        }
        return ar[top--];
    }
    T peek(){
        if (empty()){
            System.out.println("Stack is Empty");
            return null;
        }
        return ar[top];
    }
    boolean empty(){
        return top < 0;
    }
}
