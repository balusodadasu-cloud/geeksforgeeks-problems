class Solution {
	
	// function to count all pairs
	// from both the sorted arrays
	// whose sum is equal to a given
	// value
	static int countPairs(int a[], int b[], int x) {
		// code here.
		int sum=0;
		int i=0, j=b.length-1,count=0;
		while(i<a.length && j>=0) {
			sum =a[i] + b[j];
			if (sum == x) {
				count++;
				i++;
				j--;
			} else if (sum < x) {
				i++;
			} else {
				j--;
			}
		}
		return count;
	}
}
