class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new LinkedList<>();

        for(int num=0;num<(1<<nums.length);num++){
            List<Integer>sub=new LinkedList<>();

            for(int i=0;i<nums.length;i++){
                if((num &(1<<i))!=0){
                    sub.add(nums[i]);
                }
            }
            res.add(sub);
        }
        return res;
    }
}