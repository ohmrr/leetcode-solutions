class Solution:
    def countAsterisks(self, s: str) -> int:
        num = 0
        is_pair = False

        for c in s:
            if c == "|":
                is_pair = not is_pair
            elif not is_pair and c == "*":
                num += 1

        return num
