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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode>map=new HashSet<>();
        ListNode temp=head;
        if(head==null||head.next==null){
            return false;
        }
        while(head!=null&&head.next!=null){
            if(map.contains(head)){
                return true;
            }
            map.add(head);
              head=head.next;
            
        }
        return false;
    }
}