class Solution {
	public int secFrequent(String[] arr) {
		// code here
		int f = -1;
		int s = -1;
		
		if (arr.length == 0) {
			return - 1;
		}
		HashMap<String, Integer> map = new HashMap<>();
		
		for (String val : arr) {
			map.put(val, map.getOrDefault(val, 0) + 1);
		}
		
		if (map.size() == 1)
			return - 1;
		
		for (int val : map.values()) {
			if (val>f) {
				s = f;
				f = val;
			}
			else if (val>s && val != f) {
				s = val;
			}
		}
		if (f == s)
			return - 1;
		
		return s;
	}
}
