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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd=new ListNode(-1);
        ListNode even=new ListNode(-1);
        ListNode ans=odd;
        ListNode temp=even;
        int i=1;
        while(head!=null){
            if(i%2!=0){
                odd.next=head;
                odd=odd.next;
            }
            else{
                even.next=head;
                even=even.next;
            }
            head=head.next;
            i++;
        }
        odd.next=temp.next;
        even.next=null;
        return ans.next;
    }
}