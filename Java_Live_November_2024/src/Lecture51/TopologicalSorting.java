package Lecture51;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSorting {
	
	private HashMap<Integer, HashSet<Integer>> graph;

	public TopologicalSorting(int v) {
		graph = new HashMap<>();

		for (int i = 0; i <= v; i++) {
			graph.put(i, new HashSet<>());
		}
	}

	// O(1)
	public void addEdge(int v1, int v2) {
		graph.get(v1).add(v2);
	}
	
	public int[] getindegree() {
		int indeg[] = new int[graph.size()];
		
		for (int v1 : graph.keySet()) {
			for (int v2 : graph.get(v1)) {
				indeg[v2]++;
			}
		}
		return indeg;
	}
	
	public void toposort() {
		int in[] = getindegree();
		Queue<Integer> q = new LinkedList<>();
		
		for (int i = 0; i < in.length; i++) {
			if(in[i] ==0) {
				q.offer(i);
			}
		}
		
		while(!q.isEmpty()) {
			int rv = q.poll();
			System.out.print(rv+" ");
			
			for (int nbr : graph.get(rv)) {
				in[nbr]--;
				if(in[nbr] == 0) {
					q.offer(nbr);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopologicalSorting g = new TopologicalSorting(5);
		g.addEdge(0, 2);
		g.addEdge(2, 4);
		g.addEdge(4, 1);
		g.addEdge(5, 1);
		g.addEdge(5, 3);
		g.addEdge(3, 2);
		
		g.toposort();
	}

}
