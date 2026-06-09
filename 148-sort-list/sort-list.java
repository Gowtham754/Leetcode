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
    public ListNode sortList(ListNode head) {
    ArrayList<Integer>list=new ArrayList<>();
    ListNode temp2=head;
    ListNode temp=head;
    while(temp!=null){
        list.add(temp.val);
        temp=temp.next;
    }
    int i=0;
    Collections.sort(list);
    while(head!=null){
        head.val=list.get(i++);
        head=head.next;
    }
    return temp2;
        
    }
}