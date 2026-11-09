class Solution {
    private List<String>res=new LinkedList<>();
    int n;

    public List<String> generateParenthesis(int n) {
        this.n=n;
        generateString(0,0,"");
        return res;
    }

    void generateString(int open,int close,String str){
        if(open==n && close==n){
            res.add(str);
            return;
        }
        if(open<n){
            generateString(open+1,close,str+"(");
        }
        if(close<open){
            generateString(open,close+1,str+")");
        }
    }
}