# -Permutations
Given an array of distinct integers, return all possible permutations of the array.  The order of the permutations does not matter.
How it Works
Backtracking:

Use recursion to explore all possible orders of the elements in the array.
Maintain a visited array to ensure that each number is used only once in a single permutation.
Base Case:

If the size of the current permutation equals the length of the input array, add the permutation to the result list.
Iterate Through Elements:

For each number in the array, check if it has been used (visited[i]).
If not, add it to the current permutation and mark it as visited.
