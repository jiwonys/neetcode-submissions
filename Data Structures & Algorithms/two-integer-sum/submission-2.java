class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            map.put(nums[0], 0);
        for(int i = 1; i <nums.length; i++){
            if(map.get(target - nums[i]) != null){
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }
}
