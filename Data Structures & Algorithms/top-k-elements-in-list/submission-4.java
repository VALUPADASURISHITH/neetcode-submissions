class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++) map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        List<Integer>[] bucket=new ArrayList[nums.length+1];
        for(int x: map.keySet()){
            int f=map.get(x);
            if(bucket[f]==null) bucket[f]=new ArrayList<>();
            bucket[f].add(x);
        }
        int[] ans=new int[k];
        int c=0;
        for(int i=nums.length;i>=1 && c<k;i--) {
            if(bucket[i]==null) continue;
            for(int x: bucket[i]){
                ans[c++]=x;
                if(c==k) return ans;
            }
        }
        return ans;
    }
}