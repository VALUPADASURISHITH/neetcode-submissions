class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> qp=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            qp.offer(nums[i]);
            if(qp.size()>k) qp.poll();
        }
        return qp.poll();
    }
}
