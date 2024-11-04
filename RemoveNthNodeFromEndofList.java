/*
19. Remove Nth Node From End of List
Difficulty: Medium
Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 */
class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode tem=head;
        while(tem!=null){
            len++;
            tem=tem.next;
        }
        if(len<n || n<=0)
            return head;
        if(head.next==null && n==1){
            return null;
        }
        if(len==2 && n==1){
            head.next=null;
            return head;
        }
        else if(len==n){
            return head.next;
        }
        n=len-n;
        tem=head;
        while(n>1){
            tem=tem.next;
            n--;
        }
        if(tem.next!=null)
            tem.next=tem.next.next;
        else
            tem.next=null;
        return head;
    }
}
