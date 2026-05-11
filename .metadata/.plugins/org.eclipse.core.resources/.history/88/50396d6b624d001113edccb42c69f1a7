import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem_2553 {
	public int[] separateDigits(int[] nums) {

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
