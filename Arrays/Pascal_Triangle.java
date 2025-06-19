class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> lst = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> l1 = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || i==j){
                    l1.add(1);
                }
                else{
                    int s = lst.get(i-1).get(j-1)+lst.get(i-1).get(j);
                    l1.add(s);
                    
                }
            }
            lst.add(l1);
        }
        return lst;
    }
}
