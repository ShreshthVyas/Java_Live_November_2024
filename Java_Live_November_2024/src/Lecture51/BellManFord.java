package Lecture51;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BellManFord {
	
	private HashMap<Integer, HashMap<Integer, Integer>> graph;

	public BellManFord(int v) {
		graph = new HashMap<>();

		for (int i = 1; i <= v; i++) {
			graph.put(i, new HashMap<>());
		}
	}

	// O(1)
	public void addEdge(int v1, int v2, int w) {
		graph.get(v1).put(v2, w);
	}

	// O(1)
	public void addVertice(int v) {
		graph.put(v, new HashMap<>());
	}
	
	public class edgepair{
		
		int v1;
		int v2;
		int c;
		
		public edgepair(int v1,int v2,int c) {
			this.v1 = v1;
			this.v2 = v2;
			this.c = c;
		}
		
	}
	
	private List<edgepair> getalledges(){
		List<edgepair> list = new ArrayList<>();
		
		for (int v1 : graph.keySet()) {
			for (int v2 : graph.get(v1).keySet()) {
				int c = graph.get(v1).get(v2);
				list.add(new edgepair(v1, v2, c));
			}
		}
		
		return list;
	}
	
	public void bellmanford() {
		int v = graph.size();
		List<edgepair> list = getalledges();
		int arr[] = new int[v+1];
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = 99999;//Note: Avoid Max value to avoid overflow
		}
		
		for (int i = 1; i <=v; i++) { //Relax all edge pair v-1 times
			for (edgepair e : list) {
				if(i == v && arr[e.v2] > arr[e.v1]+ e.c) {//negetive cycle
					System.out.println("Negetive Cycle");
					return;
				}
				if(arr[e.v2] > arr[e.v1]+ e.c) {// Relax this edge
					arr[e.v2] = arr[e.v1]+ e.c;
				}
			}
		}
		
		for (int i = 1; i < arr.length; i++) {
			System.out.println(i+" "+ arr[i]);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BellManFord g = new BellManFord(5);
//		g.addEdge(1, 2, 1);
//		g.addEdge(1, 3, 3);
//		g.addEdge(1, 4, 2);
//		g.addEdge(3, 4, -5);
//		g.addEdge(4, 5, 4);
//		g.addEdge(2, 5, 0);
		
		g.addEdge(1, 2, -10);
		g.addEdge(2, 3, -20);
		g.addEdge(3, 4, -50);
		g.addEdge(4, 1, -60);
		
		g.bellmanford();
	}

}
