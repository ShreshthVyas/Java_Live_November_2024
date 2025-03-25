package Lecture45;

import java.util.HashSet;

public class IntersectionOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> ans = new HashSet<>();

		for (int i : nums1) {
			set.add(i);
		}

		for (int i : nums2) {
			if (set.contains(i)) { // common element
				ans.add(i);
			}
		}

		int arr[] = new int[ans.size()];
		int idx = 0;

		for (int i : ans) {
			arr[idx] = i;
			idx++;
		}

		return arr;

	}

}
