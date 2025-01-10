package Lecture17;

import java.util.Scanner;

public class CBNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		boolean visited[] =  new boolean[s.length()];
		for (int i = 1; i <= s.length(); i++) { // length of substring
			for (int j = 0; j <= s.length()-i; j++) { // starting point
				String temp = s.substring(j,j+i);
				long l = Long.parseLong(temp);
				if(isCb(l) && isVisited(j,j+i,visited)) {
					
					System.out.println(l);
					count++;
					for (int k = j; k < j+i; k++) {
						visited[k] = true;
					}
					
				}
			}
			
		}
		
		System.out.println(count);
	}

	public static boolean isVisited(int i, int j, boolean[] visited) {
		// TODO Auto-generated method stub
		
		for (int k = i; k <j; k++) {
			if(visited[k]) {
				return false;
			}
		}
		
		return true;
	}

	public static boolean isCb(long l) {
		// TODO Auto-generated method stub
		long arr[] = { 2,3,5,7,11,13,17,19,23,29};
		
		// 0 or 1
		if(l == 0 || l == 1) {
			return false;
		}
		
		// point 2
		for (int i = 0; i < arr.length; i++) {
			if(l == arr[i]) {
				return true;
			}
		}
		
		//point 3
		for (int i = 0; i < arr.length; i++) {
			if(l%arr[i] == 0) {
				return false;
			}
		}
		
		return true;
	}

}
