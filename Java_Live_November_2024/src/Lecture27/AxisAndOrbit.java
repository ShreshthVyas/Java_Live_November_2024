package Lecture27;

public class AxisAndOrbit {
//https://leetcode.com/problems/palindromic-substrings/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int countSubstrings(String s) {
		int count =0;
		//odd length
		for (int axis = 0; axis < s.length(); axis++) {
			for (int orbit = 0; axis-orbit>=0 && axis+orbit<s.length(); orbit++) {
				if(s.charAt(axis-orbit) != s.charAt(axis+orbit)) {
					break;
				}
				count++;
			}
		}
		//even length
		for (double axis = 0.5; axis < s.length(); axis++) {
			for (double orbit = 0.5; axis-orbit>=0 && axis+orbit<s.length(); orbit++) {
				if(s.charAt((int)(axis-orbit)) != s.charAt((int)(axis+orbit))) {
					break;
				}
				count++;
			}
		}
		
		return count;
	}

}
