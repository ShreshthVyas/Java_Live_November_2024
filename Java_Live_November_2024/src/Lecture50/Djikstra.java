package Lecture50;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Djikstra {

	private HashMap<Integer, HashMap<Integer, Integer>> graph;

	public Djikstra(int v) {
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

	public class Dpair {
		int v;
		String path;
		int cost;

		public Dpair(int v, String p, int cost) {
			this.v = v;
			this.path = p;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return v + " - " + path + " @ " + cost;
		}
	}

	public void djikstra() {
		PriorityQueue<Dpair> q = new PriorityQueue<>(new Comparator<Dpair>() {

			@Override
			public int compare(Dpair o1, Dpair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		for (int src : graph.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.offer(new Dpair(src,src + "", 0)); // add src

			while (!q.isEmpty()) {
				Dpair rv = q.poll(); // remove from q

				if (visited.contains(rv.v)) { // already visited then continue
					continue;
				}

				visited.add(rv.v);
				System.out.println(rv);
				for (int nbrs : graph.get(rv.v).keySet()) { // iterate to find all nbrs
					int c = graph.get(rv.v).get(nbrs) + rv.cost;
					if (!visited.contains(nbrs)) {
						q.add(new Dpair(nbrs,rv.path+"==>"+nbrs, c));
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Djikstra g = new Djikstra(7);
		g.addEdge(1, 2, 20);
		g.addEdge(1, 3, 120);
		g.addEdge(3, 4, 80);
		g.addEdge(4, 2, 100);
		g.addEdge(5, 2, 40);
		g.addEdge(5, 6, 10);
		g.addEdge(7, 6, 25);
		g.addEdge(7, 5, 15);

		g.djikstra();
	}

}
