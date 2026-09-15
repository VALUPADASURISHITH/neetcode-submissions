class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> res=new ArrayList<>();
        int n=intervals.length;
        for(int i=0;i<n;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            for(int j=i+1;j<n;j++){
                if(intervals[j][0]<=end){
                    end=Math.max(end,intervals[j][1]);
                    i=j;
                }else break;
            }
            res.add(new int[]{start,end});
        }
        return res.toArray(new int[res.size()][]);
    }
}
