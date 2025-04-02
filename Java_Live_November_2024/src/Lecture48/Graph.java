package Lecture48;
import java.util.*;

public class Graph {
	
	private HashMap<Integer,HashMap<Integer,Integer>> graph;
	
	public Graph(int v) {
		graph  = new HashMap<>();
		
		for (int i = 1; i <=v ; i++) {
			graph.put(i, new HashMap<>());
		}
	}
	
	//O(1)
	public void addEdge(int v1,int v2,int w) {
		graph.get(v1).put(v2,w);
		graph.get(v2).put(v1,w);
	}
	
	//O(1)
	public void addVertice(int v) {
		graph.put(v, new HashMap<>());
	}
	
	//O(E)
	public void removeVertice(int v) {
		for(int nbrs : graph.get(v).keySet()) {
			graph.get(nbrs).remove(v);
		}
		graph.remove(v);
	}
	
	//O(1)
	public void removeEdge(int v1, int v2) {
		graph.get(v1).remove(v2);
		graph.get(v2).remove(v1);
	}
	
	//O(1)
	public boolean containsVertice(int v) {
		return graph.containsKey(v);
	}
	
	//O(1)
	public boolean containsEdge(int v1,int v2) {
		return graph.get(v1).containsKey(v2);
	}
	
	public void Display() {
		
		for (int v : graph.keySet()) {
			System.out.println(v+ "==>" + graph.get(v));
		}
	}
	
	
	public boolean HasPath(int src,int dest) {
		return hasPath(src, dest, new HashSet<>());
	}
	
	private boolean hasPath(int src,int dest, HashSet<Integer>visited) {
		if(src == dest) { // path found
			return true;
		}
		visited.add(src);
		for(int nbrs: graph.get(src).keySet()) {
			if(!visited.contains(nbrs)) {
				boolean ans = hasPath(nbrs, dest, visited);
				if(ans == true) {
					return true;
				}
			}
		}
		
		return false;
	}
	private void printallpath(int src,int dest, HashSet<Integer>visited,String s) {
		if(src == dest) { // path found
			s+="End";
			System.out.println(s);
			return ;
		}
		visited.add(src);
		for(int nbrs: graph.get(src).keySet()) {
			if(!visited.contains(nbrs)) {
				printallpath(nbrs, dest, visited,s + nbrs +"==> ");
			}
		}
		visited.remove(src); //backtracking
	}
	
	public void PrintAllPath(int src,int dest) {
		printallpath(src, dest, new HashSet<>(),src+ "==> ");
	}
	
}
