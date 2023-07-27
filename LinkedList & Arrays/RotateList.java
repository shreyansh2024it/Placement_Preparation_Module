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
    public ListNode rotateRight(ListNode head, int k) {
        int c=1;
        ListNode temp=head;

       if(head==null|| k==0 )
       return head;

        while(temp.next!=null)
       { c++;
       temp=temp.next;
       }
       temp.next=head;

       k%=c;
       int a=c-k;

       while(a!=0)
       {
           temp=temp.next;
           --a;
       }
       head=temp.next;
       temp.next=null;

       return head;


        
    }
}