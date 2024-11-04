import java.util.ArrayList;

/*
496. Next Greater Element I
Difficulty: Easy
Link: https://leetcode.com/problems/next-greater-element-i/description/
 */
public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            int j = 0;
            while (nums2[j] != nums1[i]) {
                j++;
            }
            if (j >= nums2.length)
                list.add(-1);
            else {
                System.out.println(j);
                for (j=j+1; j < nums2.length; j++) {
                    if (nums2[j] > nums1[i]){
                        list.add(nums2[j]);
                        break;
                    }
                }
                if(j>=nums2.length)
                    list.add(-1);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }
}
