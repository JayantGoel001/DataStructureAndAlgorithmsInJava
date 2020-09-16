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
    }
}
