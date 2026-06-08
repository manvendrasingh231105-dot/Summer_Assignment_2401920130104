package Week_2.Day_1;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int b=0;
        if(ransomNote==""||magazine==""){
            return false;
        }
        List<Character> list1=new ArrayList<>();
        List<Character> list2=new ArrayList<>();
        for(char n:ransomNote.toCharArray()){
            list1.add(n);
            
        }
        for(char n1:magazine.toCharArray()){
            list2.add(n1);
        }
        for(Character s:list1){
            if(Collections.frequency(list1,s)<=Collections.frequency(list2,s)){
                b=1;

            }
            else{
                b=0;
                break;
            }
        }
        return b==1;
    }
}