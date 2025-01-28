package Lecture23;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitionLeetcode {
	static  List<List<String>> list = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		List<String> ans = new ArrayList<>();
		part(s, ans);
	}

	public static void part(String ques, List<String> ans ) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			List<String>  temp = new ArrayList<>(ans);
			list.add(temp);
			return;
		}

		for (int i = 1; i <= ques.length(); i++) {
			String left = ques.substring(0, i);
			if (isPalindrome(left)) {
				ans.add(left);
				part(ques.substring(i), ans);
				ans.remove(ans.size()-1); // backtrack
			}
		}
	}

	public static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}

		return true;
	}
	}


