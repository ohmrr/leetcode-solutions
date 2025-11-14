class Solution:
    def prefixCount(self, words: List[str], pref: str) -> int:
        res = 0
        pref_len = len(pref)

        for word in words:
            if len(word) < pref_len:
                continue
            elif word[:pref_len] == pref:
                res += 1

        return res
