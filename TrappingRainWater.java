/*
42. Trapping Rain Water
Difficulty: Hard
Link: https://leetcode.com/problems/trapping-rain-water/
*/
public class TrappingRainWater {
    public int trap(int[] height) {
        int n=height.length;
        int [] pre = new int[n];
        int [] suf = new int[n];
        for(int i=0;i<n;i++){
            pre[i]=height[i];
            if(i>0)
                pre[i]=Math.max(pre[i], pre[i-1]);
        }
        for(int i=n-1;i>=0;i--){
            suf[i]=height[i];
            if(i+1<n)
                suf[i]=Math.max(suf[i], suf[i+1]);
        }
        int ans=0;
        for(int i=1;i<n-1;i++){
            ans+=Math.max(0, Math.min(pre[i-1], suf[i+1])-height[i]);
        }
        return ans;
    }
}
