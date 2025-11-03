class Solution:
    def maxFreqSum(self, s: str) -> int:
        vowels = {'a', 'e', 'i', 'o', 'u'}
        freq = {}
        max_vowel, max_consonant = 0, 0

        for c in s:
            freq[c] = 1 + freq.get(c, 0)

            if c in vowels:
                max_vowel = max(max_vowel, freq[c])
            else:
                max_consonant = max(max_consonant, freq[c])

        return max_consonant + max_vowel
