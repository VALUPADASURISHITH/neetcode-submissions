class Solution {
    public int maxArea(int[] h) {
        int max=0;
        int l=0;
        int r=h.length-1;
        while(l<r){
            int min=Math.min(h[l],h[r]);
            max=Math.max(max,(r-l)*min);
            if(h[l]<h[r]) l++;
            else r--;
        }
        return max;
    }
}
