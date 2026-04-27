class Solution:
    def isPalindrome(self, s: str) -> bool:
        new = s.lower()
        
        i = 0
        j = len(new) - 1

        while(i < j):
            while(i < j and not new[i].isalnum()):
                i+=1
            while(i < j and not new[j].isalnum()):
                j-=1
            if(new[i] != new[j]):
                return False
            i+=1
            j-=1
        return True