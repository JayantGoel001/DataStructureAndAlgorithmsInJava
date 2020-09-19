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

    public Integer deleteAtFirst(){
        if (size==0){
            return null;
        }
        int temp = head.data;
        head = head.next;
        size--;
        if (size==0){
            tail=null;
        }
        return temp;
    }

    public Integer deleteLast(){
        if (size<=1){
            return deleteAtFirst();
        }
        Node node = head;
        while (node.next!=tail){
            node = node.next;
        }
        int temp = node.data;
        tail = node;
        node.next = null;
        size--;
        return temp;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedListCustom linkedListCustom = new LinkedListCustom();
        linkedListCustom.insertAtFirst(2);
        linkedListCustom.insertAtFirst(5);
        linkedListCustom.display();

        linkedListCustom.insertAtLast(3);
        linkedListCustom.insertAtLast(4);
        linkedListCustom.display();

        linkedListCustom.deleteLast();
        linkedListCustom.display();

        linkedListCustom.deleteAtFirst();
        linkedListCustom.display();

    }
}
