import java.util.Queue;
import java.util.LinkedList;

public class queue{
  public static void main(String[] args) {
    Queue <String> queue = new LinkedList<String>();

    

    queue.offer("Karen");
    queue.offer("Chad");
    queue.offer("Steve");
    queue.offer("Harold");

    //System.out.println(queue.isEmpty());
    //System.err.println(queue.size());
    //System.err.println(queue.contains("Harold"));

    //System.err.println(queue.peek());
    //queue.poll();


    //System.out.println(queue);
  }
}