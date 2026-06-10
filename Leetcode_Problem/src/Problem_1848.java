
public class Problem_1848 {
	public int getMinDistance(int[] nums, int target, int start) {

		// int i = 0;
		// int n = nums.length;
		// int m = n;
		// while (i != n) {   // using rotate loop
		// if (nums[(start + i) % n] == target) {
		// m = Math.min(m, Math.abs((start + i) % n - start));
		// }
		// i++;
		// }

		// return m;
		int minDist = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				int dist = Math.abs(i - start);

				if (dist < minDist) {
					minDist = dist;
				}

				if (minDist == 0) {
					return 0;
				}
			}
		}

		return minDist;

	}

}
