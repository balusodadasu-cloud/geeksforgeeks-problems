class Solution {
	public static boolean makePalindrome(String[] arr) {
		// code here
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0 ; i < arr.length ; i ++) {
			StringBuilder str = new StringBuilder(arr[i]);
			
			if (map.containsKey(str.toString())) {
				
				map.remove(str.toString());
			} else {
				String checker = str.reverse().toString();
				map.put(checker, checker);
			}
			
		}
		if (map.size() == 0) {
			return true;
		} else if (map.size() > 1) {
			return false;
		} else if (map.size() == 1) {
			for (String s : map.keySet()) {
				StringBuilder str = new StringBuilder(s);
				String huff = str.reverse().toString();
				
				if (s.equals(huff)) {
					return true;
				}
				
			}
		}
		
		return false;
	}
}
