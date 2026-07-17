class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();
        char[] schar = s.toCharArray();
        
        for(char c : schar){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                if(map.get(t.charAt(i))==1){
                    map.remove(t.charAt(i));
                }else{
                    map.put(t.charAt(i),map.get(t.charAt(i))-1);
                }
            }else{
                return false;
            }
        }

        if(map.size() == 0 ){
            return true;
        }else{
            return false;
        }

    }
}
