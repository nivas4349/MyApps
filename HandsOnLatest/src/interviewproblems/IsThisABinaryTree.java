package interviewproblems;

import java.util.HashSet;

/**
You are given a binary tree as a sequence of parent-child pairs. 
For example, the tree represented by the node pairs below:
(A,B) (A,C) (B,G) (C,H) (E,F) (B,D) (C,E)
may be illustrated in many ways, with two possible representations below:
     A   /  \  B    C / \  / \G  D  E   H       \            F        
     A   /  \  B    C / \  / \D  G H   E        /       F
Below is the recursive definition for the S-expression of a tree:
S-exp(node) = ( node->val 
(S-exp(node->first_child))(S-exp(node->second_child))), if node != NULL
                         = "", node == NULL 
   where, first_child->val < second_child->val (lexicographically smaller)
This tree can be represented in a S-expression in multiple ways. 
The lexicographically smallest way of expressing this is as follows:
(A(B(D)(G))(C(E(F))(H)))
We need to translate the node-pair representation into an S-expression 
(lexicographically smallest one), and report any errors that do not conform to the definition of a binary tree.
The list of errors with their codes is as follows:
Error Code          Type of error
E1                 More than 2 children
E2                 Duplicate Edges
E3                 Cycle present
E4                 Multiple roots
E5                 Any other error   
Input Format:
Input must be read from standard input.
Input will consist of on line of parent-child pairs. Each pair consists of two node names separated by a single comma and enclosed in parentheses. A single space separates the pairs.
Output:
The function must write to standard output.
Output the given tree in the S-expression representation described above.
There should be no spaces in the output.
Constraints:
There is no specific sequence in which the input (parent,child) pairs are represented.
The name space is composed of upper case single letter (A-Z) so the maximum size is 26 nodes.
Error cases are to be tagged in the order they appear on the list. For example, 
if one input pair raises both error cases 1 and 2, the output must be E1. 
Sample Input #00
(B,D) (D,E) (A,B) (C,F) (E,G) (A,C)
Sample Output #00
(A(B(D(E(G))))(C(F)))
Sample Input #01
(A,B) (A,C) (B,D) (D,C)
Sample Output #01
E3
Explanation
Node D is both a child of B and a parent of C, but C and B are both child nodes of A. 
Since D tries to attach itself as parent to a node already above it in the tree, this forms a cycle.
Idea:
Use a 26*26 graph to represent the input tree. Then check for each error in the order, finally use
a recursive DFS to form the tree and the output SExpression.
E1: More than 2 children. Check if graph[i][j], j from 0 to 25 has more than two cell that is true.
E2: Duplicate Edge. Check when constructing the graph, if graph[x][y] is already true, E2=true.
E3: Cycle Present: Check when looking for the root, starting from each root, use recursive DFS to check if there is
a cycle in the graph.
E4: Multiple roots: traverse all nodes in the HashSet, if no edge connected TO this node, then it must be a root.
root. If number of roots > 1, return "E4".
Note: if number of roots == 0, then there must also be a cycle, return "E3". */

public class IsThisABinaryTree {

	public static String getSExpression(String s) {
		boolean[][] graph = new boolean[26][26];
		HashSet<Character> nodes = new HashSet<>();
		// construct graph and check if it has duplicate edges
		boolean duplicate = false;
		for (int i = 1; i < s.length(); i += 6) {
			int x = s.charAt(i) - 'A', y = s.charAt(i + 2) - 'A';
			if (graph[x][y]) // duplicate edge
				duplicate = true;
			graph[x][y] = true;
			nodes.add(s.charAt(i));
			nodes.add(s.charAt(i + 2));
		}
		// check error if moreThanTwoChildren
		for (int i = 0; i < 26; i++) {
			int count = 0; // number of children
			for (int j = 0; j < 26; j++) {
				if (graph[i][j])
					count++;
			}
			if (count > 2)
				return "moreThanTwoChildren";
		}
		if (duplicate)
			return "duplicate"; // return duplicate after checking moreThanTwoChildren

		// check if cycle present. Or it it has multiple roots
		int numOfRoots = 0;
		char root = ' ';
		for (char node : nodes) { // only check char that's in the tree
			for (int i = 0; i < 26; i++) {
				if (graph[i][node - 'A'])
					break;
				if (i == 25) {
					numOfRoots++;
					root = node;
					boolean[] visited = new boolean[26];
					if (isCycle(node, graph, visited))
						return "cycle";
				}
			}
		}
		if (numOfRoots == 0)
			return "cycle"; // if there is no root, it must be a cycle
		if (numOfRoots > 1)
			return "moreThanOneRoot"; // if more than one root
		if (root == ' ')
			return "invalid"; // if no edge is in input String, return invalid input error
		return getExpressionHelper(root, graph);

	}

	// true means that there is a cycle
	private static boolean isCycle(char node, boolean[][] graph, boolean[] visited) {
		if (visited[node - 'A']) // node has already been visited, it must have a cycle
			return true;
		visited[node - 'A'] = true;
		for (int i = 0; i < 26; i++) {
			if (graph[node - 'A'][i]) {
				if (isCycle((char) (i + 'A'), graph, visited))
					return true;
			}
		}
		return false;
	}

	// Recursive DFS to get the expression/construct the tree
	private static String getExpressionHelper(char root, boolean[][] graph) {
		String left = "", right = ""; // if no children, left and right should be empty
		for (int i = 0; i < 26; i++) {
			if (graph[root - 'A'][i]) {
				left = getExpressionHelper((char) (i + 'A'), graph);
				for (int j = i + 1; j < 26; j++) {
					if (graph[root - 'A'][j]) {
						right = getExpressionHelper((char) (j + 'A'), graph);
						break;
					}
				}
				break;
			}
		}
		return "(" + root + left + right + ")";
	}

	public static void main(String[] args) {
		String s = "(A,B) (A,C) (B,G) (C,H) (E,F) (B,D) (C,E)";
		s = "(B,D) (D,E) (A,B) (C,F) (E,G) (A,C)";
		s="(A,B) (A,C) (B,D) (D,C)";
		System.out.println(getSExpression(s));
	}

}
