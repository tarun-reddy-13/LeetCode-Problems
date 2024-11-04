import java.util.PriorityQueue;

/*
4. Median of Two Sorted Arrays
Difficulty: Hard
Link: https://leetcode.com/problems/median-of-two-sorted-arrays/
 */
public class MedianOfTwoArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        double[] nums3 = new double[nums1.length+nums2.length];
        for(int i=0;i<nums1.length; i++){
            pq.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            pq.add(nums2[i]);
        }
        for(int i=0;i<nums1.length+nums2.length;i++){
            nums3[i]=(double)pq.poll();
        }
        int mid = (nums1.length+nums2.length-1)/2;
        if(nums3.length%2==0){
            return (nums3[mid]+nums3[mid+1])/2.0;
        }

        return nums3[mid];
    }
}
