class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int x=0;
        int y=0;
        int max=-1;
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            for(int j=i;j<s.length();j++){
                char c2=s.charAt(j);
                if(c1==c2) max=Math.max(max,j-i);
            }
        }
        return max-1;
    }
}