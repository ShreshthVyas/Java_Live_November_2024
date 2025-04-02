package Lecture49;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph2 {

	private HashMap<Integer, HashMap<Integer, Integer>> graph;

	public Graph2(int v) {
		graph = new HashMap<>();

		for (int i = 1; i <= v; i++) {
			graph.put(i, new HashMap<>());
		}
	}

	// O(1)
	public void addEdge(int v1, int v2, int w) {
		graph.get(v1).put(v2, w);
		graph.get(v2).put(v1, w);
	}

	// O(1)
	public void addVertice(int v) {
		graph.put(v, new HashMap<>());
	}
	
	
	public boolean bfs(int src,int dest) {
		Queue<Integer>  q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		
		q.add(src); //add src
		
		while(!q.isEmpty()) {
			int rv = q.poll(); // remove from q
			
			if(rv == dest) { //path found
				return true;
			}
			
			if(visited.contains(rv)) { // already visited then continue
				continue;
			}
			
			visited.add(rv);
			System.out.print(rv+" ");
			
			for (int  nbrs : graph.get(rv).keySet()) { //iterate to find all nbrs
				if(!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		
		return false;
		
	}
	public boolean dfs(int src,int dest) {
		Stack<Integer>  q = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		
		q.push(src); //add src
		
		while(!q.isEmpty()) {
			int rv = q.pop(); // remove from q
			
			if(rv == dest) { //path found
				return true;
			}
			
			if(visited.contains(rv)) { // already visited then continue
				continue;
			}
			
			visited.add(rv);
			System.out.print(rv+" ");
			for (int  nbrs : graph.get(rv).keySet()) { //iterate to find all nbrs
				if(!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		
		return false;
		
	}
	
	public void DFT() {
		Stack<Integer>  q = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		
		for (int src : graph.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			q.push(src); //add src
			
			while(!q.isEmpty()) {
				int rv = q.pop(); // remove from q
				
				if(visited.contains(rv)) { // already visited then continue
					continue;
				}
				
				visited.add(rv);
				System.out.print(rv+" ");
				for (int  nbrs : graph.get(rv).keySet()) { //iterate to find all nbrs
					if(!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
	}
	public void BFT() {
		Queue<Integer>  q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		
		for (int src : graph.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			q.offer(src); //add src
			
			while(!q.isEmpty()) {
				int rv = q.poll(); // remove from q
				
				if(visited.contains(rv)) { // already visited then continue
					continue;
				}
				
				visited.add(rv);
				System.out.print(rv+" ");
				for (int  nbrs : graph.get(rv).keySet()) { //iterate to find all nbrs
					if(!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
	}
	public boolean isConnected() {
		Queue<Integer>  q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int count =0;
		for (int src : graph.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			q.offer(src); //add src
			count++;
			while(!q.isEmpty()) {
				int rv = q.poll(); // remove from q
				
				if(visited.contains(rv)) { // already visited then continue
					continue;
				}
				
				visited.add(rv);
				for (int  nbrs : graph.get(rv).keySet()) { //iterate to find all nbrs
					if(!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		
		return count == 1;
	}
	public int CountComponents() {
		Queue<Integer>  q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int count =0;
		for (int src : graph.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			q.offer(src); //add src
			count++;
			while(!q.isEmpty()) {
				int rv = q.poll(); // remove from q
				
				if(visited.contains(rv)) { // already visited then continue
					continue;
				}
				
				visited.add(rv);
				for (int  nbrs : graph.get(rv).keySet()) { //iterate to find all nbrs
					if(!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		
		return count;
	}
	
	public boolean isCyclic() {
		Queue<Integer>  q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int count =0;
		for (int src : graph.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			q.offer(src); //add src
			count++;
			while(!q.isEmpty()) {
				int rv = q.poll(); // remove from q
				
				if(visited.contains(rv)) { // already visited
					//guaranteed cyclic
					return true;
				}
				
				visited.add(rv);
				for (int  nbrs : graph.get(rv).keySet()) { //iterate to find all nbrs
					if(!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		
		return false;
	}
	
	public boolean isTree() {
//		return isConnected() && !isCyclic();
		Queue<Integer>  q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int count =0;
		for (int src : graph.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			q.offer(src); //add src
			count++;
			while(!q.isEmpty()) {
				int rv = q.poll(); // remove from q
				
				if(visited.contains(rv)) { // already visited
					//guaranteed cyclic
					return false;
				}
				
				visited.add(rv);
				for (int  nbrs : graph.get(rv).keySet()) { //iterate to find all nbrs
					if(!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		
		return count==1;
		
	}

}
