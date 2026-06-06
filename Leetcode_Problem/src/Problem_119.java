import java.util.ArrayList;
import java.util.List;

public class Problem_119 {
	public List<Integer> getRow(int rowIndex) {
		List<List<Integer>> ans = new ArrayList<>();

		for (int i = 0; i <= rowIndex; i++) {
			List<Integer> row = new ArrayList<Integer>();

			for (int j = 0; j <= i; j++)
				row.add(1);

			for (int j = 1; j < i; j++)
				row.set(j, ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));

			ans.add(row);
		}
		return ans.get(rowIndex);

	}

}
