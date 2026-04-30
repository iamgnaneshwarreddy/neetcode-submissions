class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> hmap = new HashMap<>();

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        }

        for(int i = 0;i<t.length();i++){
            char c = t.charAt(i);
            hmap.put(c,hmap.getOrDefault(c,0)-1);
        }

        for(int i : hmap.values()){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
