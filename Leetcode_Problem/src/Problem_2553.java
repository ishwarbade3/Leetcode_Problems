import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem_2553 {
	public int[] separateDigits(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		for (final int num : nums)
			for (final char ch : String.valueOf(num).toCharArray())
				list.add(ch - '0');
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	public int[] separateDigits1(int[] nums) {

		StringBuilder sb = new StringBuilder();

		for (int num : nums) {
			sb.append(num);
		}

		int[] result = new int[sb.length()];

		for (int i = 0; i < sb.length(); i++) {
			result[i] = sb.charAt(i) - '0';
		}

		return result;
	}

	public int[] separateDigits2(int[] nums) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = nums.length - 1; i >= 0; i--) {
			while (nums[i] > 0) {
				int digit = nums[i] % 10;
				nums[i] /= 10;
				list.add(digit);
			}
		}
		Collections.reverse(list);
		int[] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}
}
