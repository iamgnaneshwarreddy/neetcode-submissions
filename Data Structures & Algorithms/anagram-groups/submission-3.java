class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> hmap = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(String str : strs){

            char[] st = str.toCharArray();

            Arrays.sort(st);

            String sst = new String(st);

            hmap.putIfAbsent(sst,new ArrayList<>());

            hmap.get(sst).add(str);
            
        }

        for(String str : hmap.keySet()){
            res.add(hmap.get(str));
        }
        return res;
    }
}
