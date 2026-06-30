class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                x=nums[i];
                break;
            }
        }
        return x;
    }
}
