class Solution {
    public int jump(int[] nums) {
        int[] memo = new int[nums.length];
        int jump = 0;
        
        for(int i = 0; i < nums.length; i++){
            jump = memo[i];
            for(int j = 1; j <= nums[i]; j++){
                if((i+j) >= memo.length){
                    break;
                }
                if(memo[i+j] == 0){
                    memo[i+j] = jump+1;
                }else if(memo[i+j] > jump+1){
                    System.out.println(memo[i+j] + " " + jump+1);
                    memo[i+j] = jump+1;
                }
            }
        }
        
        System.out.println(Arrays.toString(memo));
        return memo[memo.length - 1];
    }
    
    
    // 시간 초과
//     public void start(int[] nums, int index, int count){
//         if(count >= result) return ;
//         if(index == (nums.length - 1)) {
//             if(result > count) result = count;
//             return ;
//         }
        
//         if(index > (nums.length -1)) return ;
        
//         for(int i = 1; i <= nums[index]; i++){
//             start(nums, index+i, count+1);
//         }
//     }
}
