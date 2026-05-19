class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);

        int l = 0;
        int r = people.length-1;
        int boats = 0;


        while(l<r){
            int weight = people[l] + people[r];
            if(weight <= limit){
                people[l] = people[r] = -1;
                l++;
                r--;
                boats++;
            }else r--;
        }

        for(int weight : people){
            if(weight != -1) boats++;
        }
        
        return boats;
    }
}