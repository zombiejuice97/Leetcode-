class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int[] pairs = new int[8];
        int consecutives=0;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==1){
                //if(i<5){
                if(nums[i]==nums[i+1]){
                    consecutives++;

                    pairs[i]=consecutives;
                }
                //consecutives = 0;
                //}
            }
        }


        //return counter;
        int max = 0;

        for(int j=0;j<pairs.length;j++){
            if(pairs[j]>max){
                max = pairs[j];

            }
        }
               /*  if ( max%2==0){
                     max =max-1;
                 }
                else{
                    max = max+1;
                     }
*/
        return max;


    }
}
//trash