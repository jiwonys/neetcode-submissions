class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();


        Set<Integer> hset = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++){
            hset.add(nums[i]);
            if(hmap.get(nums[i]) == null){
                hmap.put(nums[i], 1);
            }else{
                hmap.put(nums[i], hmap.get(nums[i]) + 1);
            }
            

        }
        PriorityQueue<Integer>  pq = new PriorityQueue<Integer>((key1, key2) -> Integer.compare(hmap.get(key2), hmap.get(key1)));
        for(int h : hset){
            pq.add(h);
        }

        int[] output = new int[k];
        for(int i = 0; i < output.length; i++){
            output[i] = pq.poll();
        }

        return output;
    }
}
