class Solution {
    public boolean isPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')) ans+=ch;
        }
        int i=0,n=ans.length();
        ans=ans.toLowerCase();
        while(i<n/2){
            if(!(ans.charAt(i)==ans.charAt(n-i-1))) return false;
            i++;
        }
        return true;
    }
}
