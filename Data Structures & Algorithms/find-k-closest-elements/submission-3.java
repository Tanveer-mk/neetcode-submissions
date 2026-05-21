class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        ArrayList<Integer> res = new ArrayList<>(k+1);
        
        for(int i = 0; i<k; i++){
            res.add(arr[i]);
        }

        int c = 0;

        for(int i = k; i<arr.length; i++){
            
            res.add(arr[i]);

            if(Math.abs(res.get(i-c) - x) >= Math.abs(res.get(i-c-k) - x)){
                res.remove(i-c);
            }else{
                res.remove(i-c-k);
            }
            
            c++;
        }

        return res;
    }
}