class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int[] res = new int[k];

        

        Map<Integer,Integer> hmap = new HashMap<>();

        for(int i : nums){
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hmap.entrySet());

        list.sort((a,b) -> b.getValue() - a.getValue());

        for(int i = 0;i<k;i++){
            res[i] = list.get(i).getKey();
        }

        return res;



    }
}
