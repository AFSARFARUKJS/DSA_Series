class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> lst = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int a : nums ){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int k = e.getKey();
            int v = e.getValue();
            if(v > n/3){
                lst.add(k);
            }
        }
        return lst;
    }
}
