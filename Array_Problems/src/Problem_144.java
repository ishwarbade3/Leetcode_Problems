import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Problem_144 {
	public List<Integer> preorderTraversal(TreeNode root) {

		List<Integer> l = new ArrayList<Integer>();
		return preOrder(root, l);

	}

	public List<Integer> preOrder(TreeNode r, List<Integer> l) {
		if (r == null) {
			return l;
		}
//		l.add(r.val);
//		preOrder(r.left, l);
//		preOrder(r.right, l);

		return l;
	}
}
