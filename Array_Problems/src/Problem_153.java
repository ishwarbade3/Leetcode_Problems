
public class Problem_153 {
	public int findMin(int[] n) {

		int start = 0;
		int end = n.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (n[mid] > n[end])
				start = mid + 1;
			else
				end = mid;
		}
		return n[start];

	}

}
