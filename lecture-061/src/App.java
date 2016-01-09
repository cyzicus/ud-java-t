import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {
		// (HEAD) <- 0000000000000000000000 <- (TAIL) FIFO (first in, first out)

		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

		// "element" displays the head of the queue, but throws exception
		// if nothing is there
		try {
			System.out.println("HEAD of queue: " + q1.element());
		} catch (NoSuchElementException e) {
			System.out.println("Nothing in queue yet");
		}

		// "add" adds to the queue, but throws an exception if the limit is
		// reached
		q1.add(10);
		q1.add(20);
		q1.add(30);
		try {
			q1.add(40);
		} catch (IllegalStateException e) {
			System.out.println("Tried to add too many items to the queue");
		}

		System.out.println("HEAD of queue: " + q1.element());
		
		for (Integer i : q1) {
			System.out.println("Queue value: " + i);
		}

		// "remove" removes from queue, but throws exception if no element is
		// found
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());

		try {
			System.out.println("Removed from queue: " + q1.remove());
		} catch (NoSuchElementException e) {
			System.out.println("Tried to remove too many items from the queue");
		}

		///////////////////////////////////////////////////////////////////////////

		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(3);

		// "peek" displays the head of the queue but doesn't throw exception
		// Instead, it returns null if no such element is found
		System.out.println("HEAD of queue: " + q2.peek());

		// "offer" adds to the queue but doesn't throw exception if limit is reached
		// instead it returns false if unsuccessful
		q2.offer(10);
		q2.offer(20);
		q2.offer(30);
		q2.offer(40); // no exception thrown...nothing displayed
		if(q2.offer(50) == false) {
			System.out.println("Limit reached...displaying this time");
		}
		
		System.out.println("HEAD of queue: " + q2.peek());
		
		for (Integer i : q2) {
			System.out.println("Queue value: " + i);
		}

		// "poll" removes from queue but does not throw an exception if 
		// element is not found. Instead, it returns a null
		System.out.println("Removed from queue: " + q2.poll());
		System.out.println("Removed from queue: " + q2.poll());
		System.out.println("Removed from queue: " + q2.poll());
		System.out.println("Removed from queue: " + q2.poll());
		
	}

}
