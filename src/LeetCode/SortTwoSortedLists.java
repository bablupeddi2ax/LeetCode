package LeetCode;
import java.util.*;
public class SortTwoSortedLists {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(1);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(4);
        a.next = b;
        b.next = c;
        d.next = e;
        e.next = f;

        ListNode res = new ListNode(-1); // Create a dummy node for the result list
        ListNode tmp = res; // Use a temporary variable to track the result list
        while (a != null && d != null) {
            if (a.val <= d.val) {
                tmp.next = a;
                a = a.next;
            } else {
                tmp.next = d;
                d = d.next;
            }
            tmp = tmp.next; // Update the temporary variable to the newly added node
        }
        if (a != null)
            tmp.next = a; // Attach the remaining nodes from list 'a'
        if (d != null)
            tmp.next = d; // Attach the remaining nodes from list 'd'

        ListNode result = res.next; // Get the head of the merged list
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
