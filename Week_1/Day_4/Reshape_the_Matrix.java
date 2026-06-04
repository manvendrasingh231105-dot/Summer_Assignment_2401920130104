class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int rows = mat.length;
        int cols = mat[0].length;
        if((rows * cols) != (r * c)) {
            return mat;
        }

        int[][] output = new int[r][c];
        int outputr=0;
        int outputc=0;
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                output[outputr][outputc] = mat[i][j];
                outputc++;
                if(outputc==c)
                {
                    outputc=0;
                    outputr++;
                }
            }
        }       
        return output;
    }
}