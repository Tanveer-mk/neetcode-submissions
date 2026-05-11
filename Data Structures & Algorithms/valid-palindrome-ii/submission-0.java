class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        int i1 = 0;
        int j1 = 0;
        int i2 = 0;
        int j2 = 0;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)) {
                i1 = i2 = i;
                j1 = j2 = j;
                break;
            }
            i++;
            j--;
        }

        if(i1 == 0 && j1 == 0) return true;

        i1++;

        while(i1 < j1){
            if(s.charAt(i1) != s.charAt(j1)) break;
            i1++;
            j1--;
        }
        
        if(i1 >= j1) return true;

        j2--;

        while(i2 < j2){
            if(s.charAt(i2) != s.charAt(j2)) break;
            i2++;
            j2--;
        }

        if(i2 >= j2) return true;
        
        return false;

    }
}