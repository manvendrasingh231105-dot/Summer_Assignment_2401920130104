package Week_2.Day_4;

class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list=new ArrayList<>();

        paren("",list,0,0,n);
        return list;
        
    }
    void paren(String p,ArrayList<String> list,int n1,int n2,int n){
        if (p.length()==2*n){
            list.add(p);
            return;
        }
        if(n1<n){
            paren(p+'(',list,n1+1,n2,n);
        }
        if(n2<n1){
            paren(p+')',list,n1,n2+1,n);
        }
    }
}