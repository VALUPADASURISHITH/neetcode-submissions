class Solution {
    public int arraySign(int[] nums) {
        int p=1;
        for(int x:nums){
            if(x==0) return 0;
        }
        for(int x:nums){
            if(x<0) p=p*-1;
            else p=p*1;
        }
        return p;
    }
}