class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] wrd=s.split("\\s+");
        StringBuilder reversed=new StringBuilder();
        for(int i=wrd.length-1;i>=0;i--)
        {
            reversed.append(wrd[i]);
            if(i>0)
            reversed.append(" ");
        }
        String reverse=reversed.toString();
        return reverse;

        
    }
}