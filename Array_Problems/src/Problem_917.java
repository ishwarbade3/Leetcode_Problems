
public class Problem_917 {
	public String reverseOnlyLetters(String s) {

		int start = 0;
		int end = s.length() - 1;
		char ch[] = s.toCharArray();

		while (start <= end) {
			if (!isAlphabet(ch[start])) {
				start++;
			} else if (!isAlphabet(ch[end])) {
				end--;
			} else {
				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;
				start++;
				end--;
			}
		}
		return new String(ch);

	}

	public boolean isAlphabet(char ch) {
		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			return true;
		} else {
			return false;
		}
	}

}
