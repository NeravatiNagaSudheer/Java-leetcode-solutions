class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap <>();
        for(int i=0;i<nums.length;i++){
            int Pre=nums[i];
            int x=target-Pre;
            if(map.containsKey(x)){
                return new int[] {map.get(x),i};
            }
            map.put(Pre,i);
        }
        return null;
    }
}