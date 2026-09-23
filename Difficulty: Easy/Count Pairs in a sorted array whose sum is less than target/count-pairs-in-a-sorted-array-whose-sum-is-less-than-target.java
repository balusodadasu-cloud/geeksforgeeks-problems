class Solution {
	int countPairs(int arr[], int target) {
		// Your code here
		int ans = 0;
		
		int start = 0;
		int end = arr.length - 1;
		
		while (start < end) {
			if (arr[start] + arr[end] < target) {
				ans += (end - start);
				start++;
			}
			else {
				end--;
			}
		}
		
		return ans;
	}
}
