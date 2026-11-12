class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>sub=new ArrayList<>();
        combination(1,9,new ArrayList(),sub,k,n);
        return sub;
    }

    void combination(int start,int end,List<Integer>curr,List<List<Integer>>sub,int k,int n){

        if(n==0 && curr.size()==k){
            sub.add(new ArrayList(curr));
        }
        
        for(int i=start;i<=end;i++){
            curr.add(i);
        combination(i+1,end,curr,sub,k,n-i);
        curr.remove(curr.size()-1);
        }
    }
}