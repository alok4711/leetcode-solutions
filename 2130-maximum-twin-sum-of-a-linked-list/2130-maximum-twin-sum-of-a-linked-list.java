/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode temp;
    public int pairSum(ListNode head) {
        temp=head;
        return helper(head);
    }
    int helper(ListNode head){
        if(head==null) return 0;
        int n=helper(head.next);
        n= Math.max(n, temp.val+head.val);
        temp=temp.next;
        return n;
    }
}