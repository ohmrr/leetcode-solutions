class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:
        m = len(matrix)
        n = len(matrix[0])
        transpose = [[0 for _ in range(m)] for _ in range(n)]

        for row in range(n):
            for col in range(m):
                transpose[row][col] = matrix[col][row]

        return transpose
