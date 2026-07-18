class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<Integer>> map = new HashMap<>();
        
        for(int i =0;i<strs.length;i++){
            String val = strs[i];
            char[] ch = val.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            if(map.containsKey(key)){
               map.get(key).add(i);
            }else{    
                map.put(key, new ArrayList<>());
                map.get(key).add(i);
            }
        }

        List<List<String>> outputlist = new ArrayList<>();

        for(ArrayList<Integer> i: map.values()){
            List<String> group = new ArrayList<>();
            for(int val : i){
                group.add(strs[val]);
            }
            outputlist.add(group);
        }

        return outputlist;
    }
}
