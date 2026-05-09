import java.util.ArrayList;
import java.util.List;

public class Problem_118 {
	public List<List<Integer>> generate(int n) {
		List<List<Integer>> ans = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			List<Integer> row = new ArrayList<Integer>();

			for (int j = 0; j <= i; j++)
				row.add(1);

			for (int j = 1; j < i; j++)
				row.set(j, ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));

			ans.add(row);
		}
		return ans;

	}

}
