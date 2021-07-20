class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        
        for(int i = 1; i <= n; i++){
            int a = i;
            
            while(a >= 2){
                System.out.println(a);
                if(a % 2 == 1) arr[i]++;
                
                a = a / 2;
            }
            
            if(a == 1) arr[i]++;
        }
        
        return arr;
    }
}
