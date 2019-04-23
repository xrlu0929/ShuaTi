class ListNode {
    public int value;
    public ListNode next;
    public ListNode(int value) {
      this.value = value;
      next = null;
    }
 }

public class Solution {
    public ListNode insertNode(ListNode head, int target) {
        // Write your solution here
        // corner case
        ListNode insert = new ListNode(target);
        if (head == null || head.next == null || target <= head.value) {
            insert.next = head;
            return insert;
        }

        // em I think I need two cursor

        ListNode prev = head;

        while (prev.next != null && prev.next.value < target) {
            prev = prev.next;
        }

        // cannot reverse the sequence
        // otherwise, prev.next cannot be replaced
        insert.next = prev.next;
        prev.next = insert;
        return head;
    }


    public static void main(String[] args) {
        Solution e1 = new Solution();
        ListNode h1 = new ListNode(1);
        ListNode cur = h1;
        h1.next = new ListNode(3);
        h1.next.next = null;

        int t1 = 2;

        System.out.println("head");
        while(cur != null) {
            System.out.print(cur.value + "  ");
            cur = cur.next;
        }
        System.out.println();

        ListNode res= e1.insertNode(h1, t1);

        System.out.println("res");
        while(res != null){
            System.out.print(res.value + "  ");
            res = res.next;
        }
    }
}