import java.util.PriorityQueue;

/*
23. Merge k Sorted Lists
Difficulty: Hard
Link: https://leetcode.com/problems/merge-k-sorted-lists/submissions/1441763924/
 */

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(ListNode list : lists){
            while(list!=null){
                pq.add(list.val);
                list=list.next;
            }
        }
        //System.out.println()
        ListNode res=new ListNode();
        ListNode tem=res;
        int len = pq.size();
        while(len--!=0){
            tem.next = new ListNode(pq.poll());
            tem=tem.next;
        }
        return res.next;
    }
}
