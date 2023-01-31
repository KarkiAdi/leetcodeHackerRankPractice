class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        count = 0
        for char in word:
            if char.upper() == char:
                count += 1
        if (count == 1 and word[0].upper() != word[0]) or (count > 1 and count < len(word)):
            return False
        return True
