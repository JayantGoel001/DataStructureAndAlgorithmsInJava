package QueueIntro;

public class QueueCustom {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();

        for (int i = 0; i <10 ; i++) {
            queue.add(i*i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(queue.peek());
            queue.remove();
        }

        System.out.println("\n\n\n");


        CircularQueue<Integer> queue1 = new CircularQueue<Integer>();

        for (int i = 0; i < 10; i++) {
            queue1.add(i+1);
        }

        for (int i = 0; i < 5; i++) {
            queue1.remove();
        }
        for (int i = 0; i < 5; i++) {
            queue1.add(11+i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(queue1.peek());
            queue1.remove();
        }

    }
}
