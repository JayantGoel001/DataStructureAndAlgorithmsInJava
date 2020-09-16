package QueueIntro;
import java.util.*;

public class QueueIntro {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i <10 ; i++) {
            queue.add(i*i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
