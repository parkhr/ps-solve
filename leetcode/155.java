class MinStack {
    List<Integer> list = null;
    
    /** initialize your data structure here. */
    public MinStack() {
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        list.add(val);
    }
    
    public void pop() {
        list.remove(list.size() - 1);
    }
    
    public int top() {
        return list.get(list.size() - 1);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list.size(); i++){
            if(min > list.get(i)) min = list.get(i);
        }
        
        return min;
    }
}
