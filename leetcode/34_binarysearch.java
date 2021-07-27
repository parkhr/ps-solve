class Solution {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        binarySearch(0, nums.length-1, nums, target, list);

        Collections.sort(list);
        int[] arr = new int[2];
        if(list.size() == 0){
            arr[0] = -1;
            arr[1] = -1;
        }else {
            arr[0] = list.get(0);
            arr[1] = list.get(list.size() -1);
        }
        return arr;
    }

    public void binarySearch(int start, int end, int[] nums, int target, List list){
        if(start > end) return ;
        int mid = (start + end) / 2;

        binarySearch(mid+1, end, nums, target, list);
        binarySearch(start, mid-1, nums, target, list);

        if(nums[mid] == target) list.add(mid);
    }
}
