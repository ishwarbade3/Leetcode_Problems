import java.util.Arrays;

public class Problem_2784 {
	public boolean isGood(int[] n) {
		Arrays.sort(n);
		for (int i = 0; i < n.length - 1; i++)
			if (n[i] != i + 1)
				return false;

		return n[n.length - 1] == n.length - 1;

	}
}
