import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PriorityQueue<Integer> Q = new PriorityQueue<>();
        Q.add(3); Q.add(5); Q.add(2); Q.add(1);
        while(!Q.isEmpty()) {
            System.out.println(Q.poll());
        }
    }
}
