class Solution {
    public boolean hasDuplicate(int[] nums) {

        ArrayList <Integer> arr = new ArrayList<>();
        
        for(int i: nums){
            arr.add(i);
        }

        arr.sort(null);
        
        System.out.println(arr);

        for(int i = 1; i<arr.size(); i++){
            if(arr.get(i)== arr.get(i-1)){
                return true;
            }
        }
        return false;
    }
}