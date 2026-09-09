class Solution {
	boolean twoSum(int a[], int t) {
		// code here
		Arrays.sort(a);
		int l = 0;
		int r = a.length - 1;
		while (l<r) {
			int s = a[l]+a[r];
			if (s == t) {
				return true;
			}
			else if (s<t) {
				l++;
			}
			else {
				r--;
			}
		}
		
		return false;
	}
}
