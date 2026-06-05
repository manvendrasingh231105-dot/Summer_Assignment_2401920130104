class Solution {
    public boolean isPalindrome(String s) {
        List<Character> s1 = new ArrayList<>();
        for(char c:s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                s1.add(Character.toLowerCase(c));
            }
        }
        int i=0;
        int j=s1.size()-1;
        while(i<j){
            if(!s1.get(i).equals(s1.get(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
