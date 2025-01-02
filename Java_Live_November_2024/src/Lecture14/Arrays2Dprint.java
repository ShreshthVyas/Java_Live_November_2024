package Lecture14;

public class Arrays2Dprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{1,2,3,10},
						{4,5,6,11},
						{7,8,9,12}
						};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
	}

}
