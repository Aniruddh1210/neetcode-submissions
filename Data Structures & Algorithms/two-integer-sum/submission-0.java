class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }


        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i]) && map.get(target - nums[i]) != i){
                ans.add(Math.min(i, map.get(target-nums[i])));
                ans.add(Math.max(i, map.get(target-nums[i])));

                break;
            }
        }

        int[] arr = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }

        return arr;
    }
}
