class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        res = 0
        jewels = set(jewels)

        for s in stones:
            if s in jewels:
                res += 1

        return res
