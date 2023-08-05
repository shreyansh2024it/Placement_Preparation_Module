class Solution{
     void  funct(int i,int s,ArrayList<Integer> arr, int N, ArrayList<Integer> sum)
    {
        if(i==N){
        sum.add(s);
        return;
        }
        funct(i+1,s+arr.get(i),arr,N,sum);
        
        funct(i+1,s,arr,N,sum);
        
    }
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> sum=new ArrayList<>();
        funct(0,0,arr,N,sum);
        Collections.sort(sum);
        return sum;
        
    }
}