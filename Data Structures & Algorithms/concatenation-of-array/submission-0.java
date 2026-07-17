class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n+n];
        int k=n;
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            arr[k+i]=nums[i];
        }
        return arr;
    }
}