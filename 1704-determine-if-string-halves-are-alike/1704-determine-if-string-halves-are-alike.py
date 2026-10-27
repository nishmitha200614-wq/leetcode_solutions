class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        vowels = "aeiouAEIOU"
        mid = len(s) // 2
        a = s[:mid]
        b = s[mid:]
        count_a = sum(1 for ch in a if ch in vowels)
        count_b = sum(1 for ch in b if ch in vowels)
        return count_a == count_b