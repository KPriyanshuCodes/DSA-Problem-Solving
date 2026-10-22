class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new LinkedList<>();

        for(int i=0;i<numRows;i++){
            List<Integer>row=new LinkedList<>();

            for(int j=0;j<=i;j++){
                row.add(ncr(i,j));
            }
            ans.add(row);
        }
        return ans;
    }

        public int ncr(int n, int r){
            int res=1;

            for(int i=0;i<r;i++){
                res=res*(n-i)/(i+1);
            }   
            return res;
        }
    }
