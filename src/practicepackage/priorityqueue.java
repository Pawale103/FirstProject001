package practicepackage;

import java.util.PriorityQueue;

public class priorityqueue {

	public static void main(String[] args) {
		
		PriorityQueue q= new PriorityQueue();
		
		q.add("a");
		q.offer("b");
		q.add("d");
		q.add("e");
		q.add("string");
		q.add("c");
		
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q.peek());
		q.remove();
		q.poll();
		System.out.println(q);
	}

}
