class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        
        Set set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(!set.contains(i)) list.add(i);
        }
        
        return list;
      
      
      
      
//       =============================
//         Arrays.sort(nums);
//         int n = nums.length;
        
//         List<Integer> list = new ArrayList<>();
//         for(int i = 1; i <= n; i++){
//             if(Arrays.binarySearch(nums, i) < 0) list.add(i);
//         }
        
//         return list;
    }
}
