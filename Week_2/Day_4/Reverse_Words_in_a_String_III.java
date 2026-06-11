class Solution {
    public String reverseWords(String s) {
        String[] list=s.split(" ");
        String[] l2= new String[list.length];
        for(int i=0;i<list.length;i++){
            l2[i]=new StringBuilder(list[i]).reverse().toString();
        }
        return String.join(" ",l2);
    }
}