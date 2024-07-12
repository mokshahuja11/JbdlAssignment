package question3;

//Question is to create your own queue without using collection

// for implementing queue we need to make methods of queue like:
// isEmpty() to check if queue is empty or not
// enque() which is for adding the element into queue at rear
// deque() which is for removing the front element of queue

public class QueueMain {

	static class Queue {

		static int array[];

		static int size;

		static int rear = -1;

		public Queue(int n) {

			array = new int[n];
			Queue.size = n;
		}

		public boolean isEmpty() {
			if (rear == -1) {
				return true;
			} else
				return false;
		}

		public void enque(int data) {

			if (rear == size - 1) {
				System.out.println("Queue is full");
				return;
			}

			rear++;
			array[rear] = data;

		}

		public int deque() {
			if (rear == -1) {
				System.out.println("Queue is empty");
				return -1;
			}

			int front = array[0];
			for (int i = 0; i < rear; i++) {
				array[i] = array[i + 1];
			}
			rear--;
			return front;

		}

		public int peek() {
			if (rear == -1) {
				System.out.println("Queue is empty");
				return -1;
			}

			int front = array[0];

			return front;

		}

	}

	public static void main(String[] args) {
		
		Queue q = new Queue(5);
		q.enque(1);
		q.enque(2);
		q.enque(3);
		q.enque(4);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			System.out.println(q.deque());
		}
		
		

	}

}
