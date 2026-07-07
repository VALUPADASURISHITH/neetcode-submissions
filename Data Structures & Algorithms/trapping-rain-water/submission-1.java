class Solution {
    public int trap(int[] h) {
        int ans=0,lmax=0,rmax=0,l=0,r=h.length-1;
        while(l<r){
            lmax=Math.max(lmax,h[l]);
            rmax=Math.max(rmax,h[r]);
            if(h[l]<h[r]){
                ans+=Math.min(lmax,rmax)-h[l];
                l++;
            }else{
                ans+=Math.min(lmax,rmax)-h[r];
                r--;
            }
        }
        return ans;
    }
}
