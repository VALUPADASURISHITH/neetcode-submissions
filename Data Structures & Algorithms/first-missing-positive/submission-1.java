class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++) set.add(nums[i]);
        int ans=0;
        for(int i=1;i<=nums.length+1;i++){
            if(!set.contains(i)){
                ans=i;
                break;
            }
        }
        return ans;
    }
}