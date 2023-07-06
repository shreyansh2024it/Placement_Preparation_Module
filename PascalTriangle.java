class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle= new ArrayList<>();

        for(int i=0;i<numRows;i++)
        {
            List<Integer> row=new ArrayList<>();
            int ans=1;
            for(int j=0;j<=i;j++)
            {
                
                row.add(ans);
                ans = ans * (i - j) / (j + 1);
                
            }
            triangle.add(row);
        }
        
        return triangle;
    }
}