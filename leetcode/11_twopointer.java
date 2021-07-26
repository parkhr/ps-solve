// 투포인터
// 두 개의 포인터를 이용해 구간합을 구함.

class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        
        int max = 0;
        while(start < end){
            int a = Math.min(height[start], height[end]);
            int water = (end - start) * a;
            if(max < water) max = water;
            
            if(height[start] > height[end]) end--;
            else start++;
        }
        
        return max;
    }
}
