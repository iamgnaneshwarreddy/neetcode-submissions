class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> hmap = new HashMap<>();

        for(String str : strs){
            
            char[] st = str.toCharArray();

            Arrays.sort(st);

            String sst = new String(st);

            hmap.putIfAbsent(sst,new ArrayList<>());

            hmap.get(sst).add(str);

        }    
        return new ArrayList<>(hmap.values());
    
    }
}
