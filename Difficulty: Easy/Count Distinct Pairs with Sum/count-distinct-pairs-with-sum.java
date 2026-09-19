class Solution {
	static int countDistinctPairs(int arr[], int target) {
		// code here
		int count = 0;
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> det = new HashSet<>();
		for (int i = 0; i<arr.length; i++) {
			int rem = target - arr[i];
			if (set.contains(rem) && !det.contains(arr[i]) && !det.contains(rem)) {
				count++;
				det.add(arr[i]);
				det.add(rem);
				
			}
			else {
				set.add(arr[i]);
			}
		}
		return count;
	}
}
