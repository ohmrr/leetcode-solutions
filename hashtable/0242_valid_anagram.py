class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        fs, ft = {}, {}

        for i in range(len(s)):
            fs[s[i]] = 1 + fs.get(s[i], 0)
            ft[t[i]] = 1 + ft.get(t[i], 0) 

        return fs == ft