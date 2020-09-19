package LinkedListIntro;

public class LinkedListCustom {
    Node head,tail;
    int size=0;
    static class Node{
        int data;
        Node next;
        Node(){
            data=0;
            next=null;
        }
        Node(int data){
            this.data = data;
            next = null;
        }
        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }

    public void insertAtFirst(int val){
        Node node = new Node(val,head);
        head = node;
        if (size==0){
            tail = node;
        }
        size++;
    }

    public void insertAtLast(int val){
        if (size==0){
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.println(head.data+" ");
            temp=temp.next;
        }

    }
    public static void main(String[] args) {
        LinkedListCustom linkedListCustom = new LinkedListCustom();
        linkedListCustom.insertAtFirst(2);
        linkedListCustom.insertAtFirst(5);
        linkedListCustom.display();
    }
}
