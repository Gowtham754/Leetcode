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
    public int pairSum(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int l=0;
        int r=list.size()-1;
        while(l<r){
            cnt=Math.max(cnt,list.get(l)+list.get(r));
            l++;
            r--;
        }
       return cnt;
    }
}