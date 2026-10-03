class Solution {
    public int reverse(int x) {
        long rnum=0;
        while(x!=0){
            int lnum=x%10;
            rnum=(rnum*10)+lnum;
            x=x/10;
        }

        if(rnum < -2147483648L || rnum > 2147483647L){
            return 0;
        }

        return (int)rnum;
    }
}