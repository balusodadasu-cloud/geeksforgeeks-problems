class Solution {
	public List<Integer> twoSum(int arr[], int target) {
		// code here
		Arrays.sort(arr);
		int l=0;
		int r=arr.length - 1;
		
		while (l<r) {
			int sum = arr[l] + arr[r];
			if (sum == target) {
				return Arrays.asList(arr[l], arr[r]);
			} else if (sum < target) {
				l++;
			} else {
				r--;
			}
		}
		
		return new ArrayList<>();
	}
}
