class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        dfs(nums, list, list2, 0, visited);
        
        return list;
    }
    
    public void dfs(int[] nums, List<List<Integer>> list, List<Integer> list2, int index, boolean[] visited){
        if(index == nums.length) {
            List<Integer> newList = new ArrayList<>(list2.size());
            for(int i = 0; i < list2.size(); i++){
                newList.add(list2.get(i));
            }            
            list.add(newList);
            return ;
        }
        for(int i = 0; i < nums.length; i++){
            if(!visited[i]){
                visited[i] = true;
                list2.add(nums[i]);
                dfs(nums, list, list2, index+1, visited);
                visited[i] = false;
                list2.remove(index);
            }
        }
    }
}
