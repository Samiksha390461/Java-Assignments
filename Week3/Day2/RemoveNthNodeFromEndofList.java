class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null;
        ListNode s=head;
        ListNode f=head;
        ListNode prev =head;
        for(int i=1;i<=n;i++){
            f=f.next;
        }
        if(f==null){
            head= s.next;
            return head;
        }
        while(f!=null){
            prev=s;
            s=s.next;
            f=f.next;
        }
        prev.next=s.next;
        return head;
        
    }
}
