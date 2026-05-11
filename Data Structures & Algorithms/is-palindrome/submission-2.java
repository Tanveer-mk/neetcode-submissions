class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            char a = Character.toUpperCase(s.charAt(i));
            char b = Character.toUpperCase(s.charAt(j));

            if(!(a >= 'A' && a <= 'Z') && !(a >= '0' && a <= '9')) i++; 
            else if(!(b >= 'A' && b <= 'Z') && !(b >= '0' && b <= '9')) j--; 
            else if(a != b) return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
