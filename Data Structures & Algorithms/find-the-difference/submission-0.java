class Solution {
    public char findTheDifference(String s, String t) {
        char ans=0;
        for(int i=0;i<s.length();i++){
            ans^=s.charAt(i)^t.charAt(i);
        }
        return ans^=t.charAt(t.length()-1);
    }
}