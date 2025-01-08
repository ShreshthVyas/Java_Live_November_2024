package Lecture16;

public class PrintAllsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		
		for (int i = 0; i < s.length(); i++) { //starting point
			for (int j = i+1; j <= s.length(); j++) { //ending point
				System.out.println(s.substring(i,j));
			}
		}
		
	}

}
