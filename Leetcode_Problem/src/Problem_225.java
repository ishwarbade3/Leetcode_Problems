import java.util.LinkedList;
import java.util.Queue;

public class Problem_225 {
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	public void push(int x) {
		q2.add(x);

		while (!q1.isEmpty()) {
			q2.add(q1.remove());
		}
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}

	public int pop() {
		if (q1.isEmpty()) {
			return -999;
		}

		return q1.remove();
	}

	public int top() {
		if (q1.isEmpty()) {
			return -999;
		}

		return q1.peek();

	}

	public boolean empty() {
		return q1.isEmpty();

	}
}
