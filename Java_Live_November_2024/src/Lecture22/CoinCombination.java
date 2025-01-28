package Lecture22;

public class CoinCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,5};
		int amt = 10;
		
		coin(arr,amt,"",0);
	}

	public static void coin(int[] arr, int amt, String ans,int si) {
		// TODO Auto-generated method stub
		if(amt == 0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = si; i < arr.length; i++) {
			if(amt>=arr[i]) {
				coin(arr, amt-arr[i], ans+arr[i],i);
			}
		}
	}

}
