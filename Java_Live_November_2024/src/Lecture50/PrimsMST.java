package Lecture50;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class PrimsMST {
	private HashMap<Integer, HashMap<Integer, Integer>> graph;

	public PrimsMST(int v) {
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

	public class primspair {
		int v;
		int aqv;
		int cost;

		public primspair(int v, int av, int cost) {
			this.v = v;
			this.aqv = av;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return v + " - " + aqv + " @ " + cost;
		}
	}

	public int MST() {
		PriorityQueue<primspair> q = new PriorityQueue<>(new Comparator<primspair>() {

			@Override
			public int compare(primspair o1, primspair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		int mst = 0;
		for (int src : graph.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.offer(new primspair(src, src, 0)); // add src

			while (!q.isEmpty()) {
				primspair rv = q.poll(); // remove from q

				if (visited.contains(rv.v)) { // already visited then continue
					continue;
				}

				visited.add(rv.v);
				mst += rv.cost;
				System.out.println(rv);
				for (int nbrs : graph.get(rv.v).keySet()) { // iterate to find all nbrs
					int c = graph.get(rv.v).get(nbrs);
					if (!visited.contains(nbrs)) {
						q.add(new primspair(nbrs, rv.v, c));
					}
				}
			}
		}

		return mst;
	}

	public static void main(String[] args) {
		PrimsMST g = new PrimsMST(7);
		g.addEdge(1, 2, 20);
		g.addEdge(1, 3, 120);
		g.addEdge(3, 4, 80);
		g.addEdge(4, 2, 100);
		g.addEdge(5, 2, 40);
		g.addEdge(5, 6, 10);
		g.addEdge(7, 6, 25);
		g.addEdge(7, 5, 15);

		System.out.println(g.MST());
	}
}
