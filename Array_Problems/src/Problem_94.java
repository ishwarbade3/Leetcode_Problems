import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Problem_94 {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> l = new ArrayList<Integer>();
		return inOrder(root, l);
	}

	public List<Integer> inOrder(TreeNode root, List<Integer> l) {
		if (root == null)
			return l;

//         inOrder(root.left,l);
//        l.add(root.val);
//         inOrder(root.right,l);

		return l;

	}

}
