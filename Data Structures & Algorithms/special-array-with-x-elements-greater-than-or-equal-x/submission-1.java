class Solution {
    public int specialArray(int[] nums) {
        int n=nums.length;
        for(int x=0;x<=n;x++) {
            int c=0;
            for(int i=0;i<n;i++){
                if(nums[i]>=x) c++;
            }
            if(c==x) return x;

        }
        return -1;
    }
}