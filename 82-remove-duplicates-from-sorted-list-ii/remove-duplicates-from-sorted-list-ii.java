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
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> set=new HashSet<>();
         ListNode curr=head;
        while(curr!=null&&curr.next!=null){
            if(curr.val==curr.next.val){
                set.add(curr.val);
               curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        ListNode dum=new ListNode(0);
        dum.next=head;
        ListNode prev=dum;
         curr=head;
        while(curr!=null){
            if(set.contains(curr.val)){
               prev.next=curr.next;
            }
            else{
                prev=curr;
            }
            curr=curr.next;
        }
         
        return dum.next;
    }
}