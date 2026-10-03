class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> st=new ArrayDeque<>();
        for(char c:s.toCharArray()){
            if(c=='[' || c=='{' || c=='(') st.push(c);
            else{
                if(st.isEmpty()) return false;
                else if(c==']' && st.peek()!='[') return false;
                else if(c=='}' && st.peek()!='{') return false;
                else if(c==')' && st.peek()!='(') return false;
                else st.pop();
            }
        }
        return st.isEmpty();
    }
}
