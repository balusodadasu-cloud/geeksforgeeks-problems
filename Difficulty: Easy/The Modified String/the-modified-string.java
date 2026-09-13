class Solution {
	public static long modified(String a) {
		//  code here
		long c = 1, count = 0;
		char prev = a.charAt(0);
		for (int i = 1; i<a.length(); i++) {
			if (prev == a.charAt(i)) {
				c++;
			} else {
				prev = a.charAt(i);
				c = 1;
			}
			if (c == 3) {
				count++;
				c = 1;
			}
		}
		if (c == 3) {
			count++;
		}
		return count;
	}
}
