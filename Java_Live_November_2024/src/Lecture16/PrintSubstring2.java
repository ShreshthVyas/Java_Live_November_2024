package Lecture16;

public class PrintSubstring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		
		for (int i = 1; i <= s.length(); i++) { // length of substring
			for (int j = 0; j <= s.length()-i; j++) { // starting point
				System.out.print(s.substring(j,j+i) + " , ");
			}
			System.out.println();
		}
	}

}
