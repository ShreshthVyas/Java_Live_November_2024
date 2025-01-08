package Lecture16;

import java.util.Arrays;

public class MaxFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbccaaazzzzzzzdccczydcjlllllllllllllllllllllk";
		
		int arr[] = new int[26];
		
		for (char ch : s.toCharArray()) {
			arr[ch-'a']++;
		}
		int max = -1;
		int idx =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				idx = i;
			}
		}
		
		char ans  =  (char) (idx + 'a');
		
		System.out.println(ans);
	}

}
