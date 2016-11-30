# Trees and Graphs

### Key difference between tree and graph:
Working with graphs use should mark each node as visited (node.visited = true) to avoid infinite loop.

### For the graphs use should know the implementation of two basics algorithms:
- DFS (Deep-First-Search)
- BFS (Breadth-First-Search)

### For type of binary tree traversal:
1. In-order (left -> current -> right)
2. Pre-order (current -> left -> right)
3. Post-order (left -> right -> current)
4. Reverse-order (right -> current -> left)

### How to check if binary tree is a search binary tree
1. Use in-order traversal (left->current->right) - it should be a sorted array.
2. Track the min and max value for the current node and check: min <= current < max