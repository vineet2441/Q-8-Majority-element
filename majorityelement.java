class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int a=0;
        int max=0;
        int b=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]==nums[i]){
                a=a+1;
                if(a>max){
                    max=a;
                    b=nums[i];
                }
            }
            else{
                a=0;
            }
            
        }
        if(nums.length==1){
            b=nums[0];
        }
        return b;
    }
}
