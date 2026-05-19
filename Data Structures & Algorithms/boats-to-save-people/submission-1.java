class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int n = people.length;
        int l = 0;
        int r = n-1;
        int boats = 0;


        while(l<r){
            int weight = people[l] + people[r];
            if(weight <= limit){
                people[l] = people[r] = -1;
                l++;
                r--;
                boats++;
            }else if(weight > limit) r--;
            else l++;
        }


        r = n-1;
        while(r >= 0){
            if(people[r] == -1) break;
            boats++;
            people[r] = -1;
            r--;
        }
        r--;
        l = 0;
        
        for(int i: people){
            System.out.print(i + " ");
        }

        while(l <= r){
            if(people[l] == -1){
                l++;
                continue; 
            }else if(people[r] == -1){
                r--;
                continue;
            }

            if(l == r){
                boats++;
                break;
            }else{
                people[l] = people[r] = -1;
                l++;
                r--;
                boats+=2;
            }
        }

        
        return boats;
    }
}