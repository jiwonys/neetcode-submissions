class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = 0; j < nums.length; j++){
        //         if(nums[i] + nums[j] == target && i != j){
        //             return new int[]{i,j};
        //         }
        //     }

        // }
        // return new int[]{};
        Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            hmap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            if(hmap.get(target - nums[i]) != null && i != hmap.get(target - nums[i])){
                return new int[]{i , hmap.get(target - nums[i])};
            } 
        }
        return new int[]{};
    }
}
