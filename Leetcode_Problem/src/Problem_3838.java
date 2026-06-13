
public class Problem_3838 {
	public String mapWordWeights(String[] words, int[] weights) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			// char[] str = words[i].toCharArray();
			String str = words[i];
			int sum = 0;
			for (int j = 0; j < str.length(); j++) {
				// char ch = str[j];
				char ch = str.charAt(j);
				sum += weights[ch - 'a'];
			}
			int val = sum % 26;
			char c = (char) ('z' - val);
			result.append(c);

		}
		return result.toString();

	}

}
