class Solution {
    public int findNumbers(int[] nums) {
        int evenNums = 0;
        int count=0;
        for(int i=0; i< nums.length;i++){
            while(nums[i]>0){
                count++;
                nums[i] = Math.floorDiv(nums[i],10);

            }
            if(count%2==0){
                evenNums++;
            }
            else{
                count=0;
            }
            count=0;
        }
        return evenNums;
    }
}