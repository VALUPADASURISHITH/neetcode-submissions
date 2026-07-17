class Solution {
    public int majorityElement(int[] nums) {
        int c=1;
        int maj=nums[0];
        for(int i=1;i<nums.length;i++){
            if(maj==nums[i]) c++;
            else c--;
            if(c<=0){
                maj=nums[i];
                c=1;
            }
        }
        return maj;
    }
}