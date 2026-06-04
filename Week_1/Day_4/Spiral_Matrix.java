class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        List<Integer> l1=new ArrayList<>();

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                l1.add(matrix[top][i]);
            }

            top++;

            for(int j=top;j<=bottom;j++){
                l1.add(matrix[j][right]);
            }
            right--;

            if(top<=bottom){
                for(int k=right;k>=left;k--){
                    l1.add(matrix[bottom][k]);
                }
                bottom--;
            }

            if(left<=right){
                for(int l=bottom;l>=top;l--){
                    l1.add(matrix[l][left]);
                }
                left++;
            }
        }
        return l1;
    }
}