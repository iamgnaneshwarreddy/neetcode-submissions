class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> hmap = new HashMap<>();

        for( String st : strs){
            
            char[] cr = st.toCharArray();
            Arrays.sort(cr);


            String key = new String(cr);

            if(!hmap.containsKey(key)){
                hmap.put(key,new ArrayList<>());
            } 
            hmap.get(key).add(st);
        }
        return new ArrayList<>(hmap.values());
    }
}
