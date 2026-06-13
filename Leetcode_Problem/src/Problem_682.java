import java.util.Stack;

public class Problem_682 {
	public int calPoints(String[] operations) {
		Stack<Integer> ans = new Stack<Integer>();

		for (int i = 0; i < operations.length; i++) {
			String str = operations[i];
			if (str.equals("C")) {
				if (!ans.isEmpty()) {
					ans.pop();
				}
			} else if (str.equals("D")) {
				if (!ans.isEmpty()) {
					int data = ans.peek();
					ans.add(data * 2);
				}
			} else if (str.equals("+")) {
				if (!ans.isEmpty()) {
					int d1 = ans.pop();
					int d2 = ans.pop();

					ans.add(d2);
					ans.add(d1);
					ans.add(d1 + d2);
				}

			} else {
				ans.add(Integer.parseInt(str));
			}

		}
		int sum = 0;
		while (!ans.isEmpty()) {
			int val = ans.peek();
			ans.pop();
			sum = sum + val;
		}
		return sum;
	}

}
