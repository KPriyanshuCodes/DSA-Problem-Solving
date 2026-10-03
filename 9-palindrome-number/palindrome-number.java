class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        
        int rnum = 0;
        int num=x;
        while(x!=0){
            int lnum = x%10;
            rnum = (rnum*10)+lnum;
            x=x/10;
        }
       
       return num==rnum;
    }
}