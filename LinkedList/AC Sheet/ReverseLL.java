class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode pres = head;

        while (pres != null) {
            ListNode next = pres.next;
            pres.next = prev;
            prev = pres;
            pres = next;
        }

        return prev;
    }
}

public class ReverseLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                new ListNode(3)));

        Solution solution = new Solution();
        ListNode reversed = solution.reverseList(head);

        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }
    }
}