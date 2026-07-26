/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack<ListNode> sA=new Stack<>();
        Stack<ListNode> sB=new Stack<>();
        while(headA!=null){
            sA.push(headA);
            headA=headA.next;
        }
        while(headB!=null){
            sB.push(headB);
            headB=headB.next;
        }
        ListNode ans=null;
        while(sA.peek()==sB.peek()){
            ans=sA.pop();
            sB.pop();
            if(sA.isEmpty() || sB.isEmpty()){
                return ans;
            }
        }
        return sA.pop().next;
    }
}