//optimal soln TC: O(nlogn) SCL 

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        ArrayList<Integer> keys = new ArrayList<>(map.keySet());

        keys.sort((a, b) -> Integer.compare(map.get(b), map.get(a)));

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = keys.get(i);
        }

        return ans;
    }
}