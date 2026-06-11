package Week_2.Day_4;

class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch!=']'){
                st.push(ch);
            }
            else{
                StringBuilder sb = new StringBuilder();
                while(!st.isEmpty() && st.peek()!='['){
                    if(st.peek()>='a' &&  st.peek()<='z'){
                        sb.append(st.pop());
                    }
                }
                sb.reverse();
                st.pop(); 
                int base = 1;
                int times = 0;
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    times = (st.pop()-'0')*base + times;
                    base*=10;
                }
                StringBuilder temp = new StringBuilder();
                for(int i=0; i<times; i++){
                    temp.append(sb);
                }
                for(char c:temp.toString().toCharArray()){
                    st.push(c);
                }
                
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();
        return ans.toString();
    }
}