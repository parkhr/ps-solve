class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else {
                map.put(nums[i], 1);
            }
            
            if(max < map.get(nums[i])){
                max = map.get(nums[i]);
                index = nums[i];
            }
        }
        
        return index;
    }
}
