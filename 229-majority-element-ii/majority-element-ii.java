class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int can1=0;
        int can2=0;
        int count1=0;
        int count2=0;

        for(int num:nums){
            if(num==can1 && count1>0){
                count1++;
            }
            else if(num==can2 && count2>0){
                count2++;
            }
            else if(count1==0){
                can1=num;
                count1=1;
            }
            else if(count2==0){
                can2=num;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int num:nums){
            if(num==can1){
                count1++;
            }
            else if(num==can2){
                count2++;
            }
        }
        List<Integer>res=new LinkedList<>();
        int n=nums.length;
        if(count1>n/3){
            res.add(can1);
        }
        if(count2>n/3){
            res.add(can2);
        }
        return res;
    }
}