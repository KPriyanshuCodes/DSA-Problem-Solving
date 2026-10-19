class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int cnum=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                cnum=nums[i];
            }
            if(nums[i]==cnum){
                count++;
            }
            else
            count--;
        }
        return cnum;
    }
}
