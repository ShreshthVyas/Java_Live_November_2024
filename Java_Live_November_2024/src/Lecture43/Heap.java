package Lecture43;

import java.util.ArrayList;

public class Heap {

	private ArrayList<Integer> heap;
	
	public Heap() {
		heap = new ArrayList<>();
	}
	
	public void add(int item) {
		heap.add(item);
		upheapify(heap.size()-1);
	}

	private void upheapify(int ci) {// O (LogN)
		// TODO Auto-generated method stub
		int pi = (ci-1)/2;
		
		if(heap.get(pi)> heap.get(ci)) {
			swap(pi,ci);
			upheapify(pi);
		}
	}

	private void swap(int pi, int ci) {
		// TODO Auto-generated method stub
		int tp = heap.get(pi);
		int tc = heap.get(ci);
		
		heap.set(ci, tp);
		heap.set(pi, tc);
		
	}
	
	public int remove() {
		int rv = heap.get(0);
		swap(0, heap.size()-1);
		heap.remove(heap.size()-1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) { // O (LogN)
		// TODO Auto-generated method stub
		int c1 = 2*pi +1;
		int c2 = 2*pi +2;
		int mini = pi;
		
		if(c1< heap.size() && heap.get(c1) < heap.get(mini)) {
			mini = c1;
		}
		if(c2<heap.size() &&  heap.get(c2) < heap.get(mini)) {
			mini = c2;
		}
		
		if(mini!=pi) {
			swap(pi,mini);// will be swapped with either c1 or c2
			downheapify(mini);
		}
		
	}
	
	public int get() {
		return heap.get(0);
	}
	
	
	

}
