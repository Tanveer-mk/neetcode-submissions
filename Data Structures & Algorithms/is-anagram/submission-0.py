class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        original = set(s)
        anagram = set(t)

        for i in original:
            if(s.count(i) == t.count(i) and len(original) == len(anagram)):
                continue
            else:
                return False
        
        return True