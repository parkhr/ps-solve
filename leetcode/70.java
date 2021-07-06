// 나는 combination 으로 풀어서 시간복잡도는 O(2^n)
// 근데 n이 1 <= n <= 45 여서 2^45 는 너무 크다. => 메모이제이션을 써서 똑같은 작업 반복 X

public class Solution {
    public int climbStairs(int n) {
        int memo[] = new int[n+1];
        return climb_Stairs(0, n, memo);
    }
    public int climb_Stairs(int i, int n, int memo[]) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        
        if(memo[i] > 0) return memo[i];
        
        memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
        return memo[i];
    }
}
