class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        solve(nums,0,subset,subsets);
        return subsets;
    }
    static void solve(int[] nums,int index,List<Integer> subset,List<List<Integer>> subsets){
        if(index>=nums.length){
            subsets.add(new ArrayList(subset));
            return;
        }
        subset.add(nums[index]);
        solve(nums,index+1,subset,subsets);
        subset.remove(subset.size()-1);
        solve(nums,index+1,subset,subsets);
    }
}
