/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode ans = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(slow==fast){
            if(slow==ans) return ans;
            fast=fast.next;
            while(fast != null && fast.next != null){
                if(fast==ans) return ans;
                if(slow==fast) ans=ans.next;
                fast=fast.next;
            }
        }
        return null;
    }
}