package Lecture49;

import Lecture48.Graph;

public class Graph2Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph2 g = new Graph2(7);
		g.addEdge(1, 2, 10);
		g.addEdge(1, 3, 20);
//		g.addEdge(3, 4, 30);
		g.addEdge(4, 2, 40);
		g.addEdge(5, 2, 50);
		g.addEdge(5, 6, 60);
//		g.addEdge(7, 6, 60);
		g.addEdge(7, 5, 70);
		
//		g.addVertice(8);
		
//		System.out.println(g.bfs(1, 7));
//		System.out.println();
//		System.out.println(g.dfs(1, 7));
		
//		g.BFT();
//		System.out.println();
//		g.DFT();
		
//		System.out.println(g.isConnected());
//		System.out.println(g.CountComponents());
		
		System.out.println(g.isCyclic());
		
	}

}
