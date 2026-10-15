class Solution {
    public void moveZeroes(int[] nums) {
        int x=0,y=0;
        while(x<nums.length){
            if(nums[x]!=0){
            int temp=nums[x];
            nums[x]=nums[y];
            nums[y]=temp;
            y++;
            }
            x++;
        }
    }
}



