class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String str=s.substring(i,j+1);
                max=Math.max(max,check(str));
            }
        }        
        return max;
    }
    static int check(String s){
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++) set.add(s.charAt(i));
        if(set.size()==s.length()) return s.length();
        return 0;
    }
}
