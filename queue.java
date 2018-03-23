import java.util.*;
class queue
{
	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.offer("first");
		q.offer("second");
		q.offer("third");
		System.out.printf("Queue : %s\n", q);

		System.out.printf("Peeked : %s\n", q.peek());
		q.poll();
		System.out.printf("Queue : %s\n", q);

	}
}