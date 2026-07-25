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
    public void reorderList(ListNode head) {
        Stack<ListNode> s=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            s.push(temp);
            temp=temp.next;
        }
        temp=head;
        int n=s.size()/2;
        for(int i=0; i<n; i++){
            ListNode t=temp.next;
            temp.next=s.pop();
            temp=temp.next;
            temp.next=t;
            temp=temp.next;
        }
        temp.next=null;
        return;
    }
}