class Solution {
	public boolean hasTripletSum(int arr[], int target) {
		// code Here
		for (int i = 0; i < arr.length - 2; i++)
			{
			
			HashSet<Integer> set = new HashSet<>();
			
			for (int j = i + 1; j < arr.length; j++)
				{
				
				int comp = target - arr[i] - arr[j];
				
				if (set.contains(comp)) {
					return true;
				}
				
				set.add(arr[j]);
			}
		}
		
		return false;
	}
}
