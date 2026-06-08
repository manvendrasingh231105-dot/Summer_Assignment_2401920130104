package Week_2.Day_1;

class Solution {
    public int firstUniqChar(String s){
        HashMap<Character,Integer> m1=new HashMap<>();
        for(char c:s.toCharArray()){
            m1.put(c,m1.getOrDefault(c, 0)+1);
        }

        for(int i=0; i<s.length();i++){
            if(m1.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;        
    }
}