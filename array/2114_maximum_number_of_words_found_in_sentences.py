class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        maximum = 0

        for sentence in sentences:
            words = sentence.count(" ") + 1
            maximum = max(maximum, words)

        return maximum
