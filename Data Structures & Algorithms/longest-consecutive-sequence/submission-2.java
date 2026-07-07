class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set=new HashSet<>();
        int max=1;
        for(int x: nums) set.add(x);
        for(int x: set) {
            int c=1;
            if(!set.contains(x-1)){
                int y=x;
                while(set.contains(++y)) c++;
                max=Math.max(max,c);
            }
            c=1;
        }
        return max;
    }
}
