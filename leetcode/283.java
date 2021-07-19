class Solution {
    public void moveZeroes(int[] nums) {
        int index = nums.length-1;
        
        for(int i = 0; i <= index; i++){
            if(nums[i] == 0){
                for(int j = i; j < index; j++){
                    nums[j] = nums[j+1];
                }
                
                nums[index] = 0;
                
                index--;
                i--;
            }
        }
    }
}
