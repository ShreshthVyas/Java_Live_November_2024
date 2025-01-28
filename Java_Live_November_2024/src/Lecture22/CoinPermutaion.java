package Lecture22;

public class CoinPermutaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,5};
		int amt = 10;
		
		coin(arr,amt,"");
	}

	public static void coin(int[] arr, int amt, String ans) {
		// TODO Auto-generated method stub
		if(amt == 0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(amt>=arr[i]) {
				coin(arr, amt-arr[i], ans+arr[i]);
			}
		}
		
	}

}
