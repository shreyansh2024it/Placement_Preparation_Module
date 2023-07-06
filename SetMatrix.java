class Solution {
    public void setZeroes(int[][] matrix) {
        int l1=matrix.length;
        int l2=matrix[0].length;
        int[] rows=new int[l1];
        int[] col=new int[l2];
        for(int i=0;i<l1;i++)
        {
            for(int j=0;j<l2;j++)
            {
                if(matrix[i][j]==0)
                {
                    rows[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<l1;i++)
        {
            for(int j=0;j<l2;j++)
            {
                if(rows[i]==1 || col[j]==1)
                matrix[i][j]=0;
            }
        }
        
    }
}