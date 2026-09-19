class Solution {
	int countPairs(int a[], int t) {
		//  Code Here
		int l = 0;
		int r = a.length - 1;
		int c = 0;
		
		while (l < r) {
			int s = a[l] + a[r];
			
			if (s == t) {
				if (a[l] == a[r]) {
					int n = r - l + 1;
					c += n * (n - 1) / 2;
					break;
				}
				
				int left = 1;
				int right = 1;
				
				while (l + 1 < r && a[l] == a[l + 1]) {
					left++;
					l++;
				}
				
				while (r - 1 > l && a[r] == a[r - 1]) {
					right++;
					r--;
				}
				
				c += left * right;
				
				l++;
				r--;
			}
			else if (s < t) {
				l++;
			}
			else {
				r--;
			}
		}
		
		return c;
	}
}
