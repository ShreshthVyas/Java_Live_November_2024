package Lecture14;

public class SearchIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		
		boolean ans  = Search(arr,-9);
		
		System.out.println(ans);
	}

	public static boolean Search(int[][] arr, int target) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == target) {
					return true;
				}
			}	
		}
		return false;
	}

}
