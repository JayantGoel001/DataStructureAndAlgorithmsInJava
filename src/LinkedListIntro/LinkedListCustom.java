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

    public int mid(){
        Node first = head;
        Node second = head;
        while (first!=null && second!=null && second.next!=null){
            first = first.next;
            second = second.next.next;
        }
        return first.data;
    }

    public boolean cycleDetection(){
        if (size<3){
            return false;
        }
        Node slow = head;
        Node fast = head.next.next;
        while (slow!=null && fast!=null && fast.next!=null){
            if (slow==fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
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
        System.out.println("Mid:"+linkedListCustom.mid());
        System.out.println("Cycle Detection : "+linkedListCustom.cycleDetection());
        linkedListCustom.insertAtFirst(6);
        linkedListCustom.insertAtFirst(9);
        linkedListCustom.tail.next = linkedListCustom.head;
        System.out.println("Cycle Detection : "+linkedListCustom.cycleDetection());



    }
}
