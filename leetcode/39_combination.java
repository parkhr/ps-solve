// 옛날에 많이 했던 콤비네이션 문제..

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target){

        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            temp.add(candidates[i]);
            sum(candidates[i], candidates, target, temp, i);
            temp.remove(temp.size() -1);
        }

        return result;
    }

    public void sum(int number, int[] candidate, int target, List<Integer> temp, int start){
        if(number == target){
            result.add(new ArrayList<>(temp));
        }

        if(number > target) return ;

        for (int i = start; i < candidate.length; i++) {
            temp.add(candidate[i]);
            sum(number + candidate[i], candidate, target, temp, i);
            temp.remove(temp.size()-1);
        }
    }
}
