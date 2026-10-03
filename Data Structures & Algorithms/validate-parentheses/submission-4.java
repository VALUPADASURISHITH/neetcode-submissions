class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> st=new ArrayDeque<>();
        for(char c:s.toCharArray()){
            if(c=='[' || c=='{' || c=='(') st.push(c);
            else{
                if(st.isEmpty()) return false;
                else if(c==']' && st.pop()!='[') return false;
                else if(c=='}' && st.pop()!='{') return false;
                else if(c==')' && st.pop()!='(') return false;
            }
        }
        return st.isEmpty();
    }
}
