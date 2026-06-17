
public class Problem_3612 {
	class Solution {
		// public String processStr(String s) {
		// Stack<Character> st = new Stack<Character>();
		// StringBuilder sb;

		// for (int i = 0; i < s.length(); i++) {
		// char ch = s.charAt(i);
		// if (ch == '*') {
		// if (!st.isEmpty())
		// st.pop();
		// } else if (ch == '#') {
		// // if (!st.isEmpty()) st.push(st.peek());

		// int size = st.size();

		// List<Character> temp = new ArrayList<>();

		// for (int k = 0; k < size; k++) {
		// temp.add(st.get(k));
		// }

		// for (char c : temp) {
		// st.push(c);
		// }

		// } else if (ch == '%') {
		// sb = new StringBuilder();
		// while (!st.isEmpty()) {
		// sb.append(st.pop());
		// }
		// for (int j = 0; j < sb.length(); j++) {
		// char c = sb.charAt(j);
		// st.push(c);
		// }

		// } else {
		// st.push(ch);
		// }
		// }
		// sb = new StringBuilder();
		// while (!st.isEmpty()) {
		// sb.append(st.pop());
		// }
		// return sb.reverse().toString();
		// }
		public String processStr(String s) {
			StringBuilder sb = new StringBuilder();

			for (char ch : s.toCharArray()) {
				if (ch == '*') {
					if (sb.length() > 0) {
						sb.deleteCharAt(sb.length() - 1);
					}
				} else if (ch == '#') {
					sb.append(sb.toString());
				} else if (ch == '%') {
					sb.reverse();
				} else {
					sb.append(ch);
				}
			}

			return sb.toString();
		}
	}

}
