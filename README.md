# LeetCode Solutions in Python

Tracking my LeetCode progress, organized by difficulty and topic.

## Arrays

| # | Problem | Solution | Difficulty | Time | Space | Tags | Notes |
|---|----------|-----------|-------------|-------|--------|--------|--------|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/description/) | [Python](./array/0001_two_sum.py) | Easy | $O(n)$ | $O(n)$ | Array, Hash Table | Basic hashmap lookup |
| 217 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/description/) | [Python](./array/0217_contains_duplicate.py) | Easy | $O(n)$ | $O(n)$ | Array, Hash Table, Sorting | Use a set to only keep unique values |
| 704 | [Binary Search](https://leetcode.com/problems/binary-search/description/) | [Python](./array/0704_binary_search.py) | Easy | $O(\log n)$ | $O(1)$ | Array, Binary Search | Halve the search range after each iteration |
| 1480 | [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/description/) | [Python](./array/1480_running_sum_of_1d_array.py) | Easy | $O(n)$ | $O(1)$ | Array, Prefix Sum | Edit the input array for O(1) space complexity |
| 1929 | [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/description/) | [Python](./array/1929_concatenation_of_array.py) | Easy | $O(n)$ | $O(n)$ | Array, Simulation | Can use `nums * 2` short hand |
| 2011 | [Final Value of Variable After Performing Operations](https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/) | [Python](./array/2011_final_value_of_variable_after_performing_operations.py) | Easy | $O(n)$ | $O(1)$ | Array, String |  |
| 2942 | [Find Words Containing Character](https://leetcode.com/problems/find-words-containing-character/description/) | [Python](./array/2942_find_words_containing_character.py) | Easy | $O(n * m)$ | $O(n)$ | Array, String, Simulation | Scan n words of length l |
| 3701 | [Compute Alternating Sum](https://leetcode.com/problems/compute-alternating-sum/description/) | [Python](./array/3701_compute_alternating_sum.py) | Easy | $O(n)$ | $O(1)$ | Array, Simulation |  |

## Strings

| # | Problem | Solution | Difficulty | Time | Space | Tags | Notes |
|---|----------|-----------|-------------|-------|--------|--------|--------|
| 58 | [Length of Last Word](https://leetcode.com/problems/length-of-last-word/description/) | [Python](./string/0058_length_of_last_word.py) | Easy | $O(n)$ | $O(1)$ | String | Count characters from the end until a space |
| 125 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/description/) | [Python](./string/0125_valid_palindrome.py) | Easy | $O(n)$ | $O(1)$ | Two Pointers, String | Increase/decrease pointer until an alphanumeric character is found |
| 412 | [FizzBuzz](https://leetcode.com/problems/fizz-buzz/description/) | [Python](./string/0412_fizz_buzz.py) | Easy | $O(n)$ | $O(n)$ | Math, String, Simulation |  |
| 2315 | [Count Asterisks](https://leetcode.com/problems/count-asterisks/description/) | [Python](./string/2315_count_asterisks.py) | Easy | $O(n)$ | $O(1)$ | String | Use boolean to track whether inside '\|' pair |
| 3110 | [Score of a String](https://leetcode.com/problems/score-of-a-string/description/) | [Python](./string/3110_score_of_a_string.py) | Easy | $O(n)$ | $O(1)$ | String | Use `ord` to get ASCII values |

## Hash Table

| # | Problem | Solution | Difficulty | Time | Space | Tags | Notes |
|---|----------|-----------|-------------|-------|--------|--------|--------|
| 771 | [Jewels and Stones](https://leetcode.com/problems/jewels-and-stones/description/) | [Python](./hashtable/0771_jewels_and_stones) | Easy | $O(n + m)$ | $O(m)$ | Hash Table, String | Use a set for constant lookup |

## Linked List

| # | Problem | Solution | Difficulty | Time | Space | Tags | Notes |
|---|----------|-----------|-------------|-------|--------|--------|--------|
| 237 | [Delete Node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/description/) | [Python](./linkedlist/0237_delete_node_in_a_linked_list.py) | Medium | $O(n)$ | $O(1)$ | Linked List | Suboptimal time complexity, WIP |
