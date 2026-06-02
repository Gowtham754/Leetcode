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
        ListNode n=headA;
        ListNode m=headB;
        while(n!=m){
            n=(n==null)?headB:n.next;
            m=(m==null)?headA:m.next;
        }
        return n;
       
    }
}