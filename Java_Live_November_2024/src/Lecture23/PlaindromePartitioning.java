package Lecture23;

public class PlaindromePartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		part(s, "");
	}

	public static void part(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 1; i <= ques.length(); i++) {
			String left = ques.substring(0, i);
			if (isPalindrome(left)) {
				part(ques.substring(i), ans + left + " | ");
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
