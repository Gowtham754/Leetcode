class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode t1=list1,t2=list1,t3=list2;
        int cnt=0;
        while(t3.next!=null){
            t3=t3.next;
        }
        while(cnt<a-1) {
            t1=t1.next;
            cnt++;
        }
        t2=t1;
        while(cnt<b) {
            t2=t2.next;
            cnt++;
        }
        t3.next=t2.next;
        t1.next=list2;
        return list1;
    }
}