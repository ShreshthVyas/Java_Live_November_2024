package Lecture11;

public class IsBadVersion_Leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int firstBadVersion(int n) {
		int i = 1;
		int j = n;
		int ans = -1;
		while(i<=j) {
			int mid =  i + (j-i)/2;
			if(isBadVersion(mid)) { //left
				ans = mid;
				j = mid-1;
			}
			else { //right
				i = mid+1;
			}
		}
		return ans;
	}
	
	public static boolean isBadVersion(int version) {
		return false;
	}
	

}
