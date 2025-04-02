package Lecture49;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BiPartite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isBipartite(int[][] graph) {
		Queue<bipair>  q = new LinkedList<>();
		HashMap<Integer,Integer> visited = new HashMap<>();
		
		for (int i=0;i<graph.length;i++) {
			if(visited.containsKey(i)) {
				continue;
			}
			q.offer(new bipair(i, 0)); //add src
			while(!q.isEmpty()) {
				bipair rv = q.poll(); // remove from q
				
				if(visited.containsKey(rv.v)) { // already visited
					//guaranteed cyclic
					if(visited.get(rv.v)!= rv.d) {//odd length cycle
						return false;
					}
					
				}
				
				visited.put(rv.v, rv.d);
				for (int  nbrs : graph[rv.v]) { //iterate to find all nbrs
					if(!visited.containsKey(nbrs)) {
						q.add(new bipair(nbrs, rv.d+1));
					}
				}
			}
		}
		
		return true;
	}
	
	public class bipair{
		int v;
		int d;
		
		public bipair(int v,int d) {
			this.v = v;
			this.d = d;
		}
	}

}
