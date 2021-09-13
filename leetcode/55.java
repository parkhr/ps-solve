class Solution {
    public boolean canJump(int[] nums) {
        int visit[] = new int[nums.length - 1];
        
        recu(0, nums);

        return check;
    }
    
    boolean check = false;
    int[] visit = new int[100000];
    
    public void recu(int index, int[] nums){
        
        if(check) return ;
       
        if(index == nums.length - 1){
            check = true;
            return ;
        }else if(index > nums.length - 1){
            visit[index] = 1;
            return ;
        }
        else if(visit[index] == 1) return ;
        
        for(int i = nums[index]; i >= 1; i--){
            recu(index + i, nums);
        }
        
        visit[index] = 1;
    }
}

/*
* 완전탐색 => 시간초과
* 완전탐색으로 방문했던곳을 메모이제이션을 통해 시간 단축
*/
