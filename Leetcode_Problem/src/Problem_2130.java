
public class Problem_2130 {
//	public int pairSum(ListNode head) {
//
//		ListNode slow = head;
//		ListNode fast = head;
//		while (fast != null && fast.next != null) {
//			slow = slow.next;
//			fast = fast.next.next;
//		}
//		ListNode prev = null;
//		ListNode curr = slow;
//
//		while (curr != null) {
//			ListNode next = curr.next;
//			curr.next = prev;
//			prev = curr;
//			curr = next;
//		}
//		slow = prev;
//		fast = head;
//		int sum = Integer.MIN_VALUE;
//		while (slow != null) {
//			sum = Math.max(sum, fast.val + slow.val);
//
//			slow = slow.next;
//			fast = fast.next;
//		}
//		return sum;
//
//	}

}
