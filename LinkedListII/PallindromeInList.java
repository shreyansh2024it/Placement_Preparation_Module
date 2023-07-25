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
    public boolean isPalindrome(ListNode head) {
        
        
        ListNode node=head;
        
        

        ArrayList<Integer> arr=new ArrayList<>();
        
        while(node!=null)
        {
            arr.add(node.val);
            
            node=node.next;
            
        }
        for(int j=0;j<arr.size();j++)
        {
            if(arr.get(j)!=arr.get(arr.size()-j-1))
            return false;
        }
        return true;
        
    }
}