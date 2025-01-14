package Lecture18;

public class MaxSumPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 3, 7, 10, 12, 15, 30, 34};
		int brr[] = {1, 5, 7, 8, 10, 15, 16, 19};
		
		System.out.println(maxsum(arr,brr));
	}

	public static int maxsum(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int sum1 = 0;int sum2 = 0;
		int ans = 0;
		int i =0;
		int j =0;
		
		while(i<arr.length && j<brr.length) {
			if(arr[i]<brr[j]) {
				sum1+= arr[i];
				i++;
			}
			else if(arr[i]>brr[j]) {
				sum2+= brr[j];
				j++;
			}
			else {
				if(sum1>sum2) {
					ans+=sum1;
				}
				else {
					ans+=sum2;
				}
				while(i<arr.length && j<brr.length && arr[i] == brr[j]) {
					ans+=arr[i];
					i++;
					j++;
				}
				sum1=0;
				sum2=0;
			}
		}
		
		while(i<arr.length) {
			sum1+= arr[i];
			i++;
		}
		
		while(j<brr.length) {
			sum2+= brr[j];
			j++;
		}
		
		ans+= Math.max(sum1, sum2);
		return ans;
		
	}

}
