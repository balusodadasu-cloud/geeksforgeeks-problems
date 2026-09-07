class Solution {
	public char nonRepeatingChar(String s) {
		// code here
		Map<Character, Integer> m = new HashMap();
		int n = s.length();
		for (int i = 0; i<n; i++) {
			char ch = s.charAt(i);
			m.put(ch, m.getOrDefault(ch, 0) + 1);
		}
		for (int i = 0; i<n; i++) {
			char ch = s.charAt(i);
			if (m.get(ch) == 1) {
				return ch;
			}
		}
		return '$';
	}
}
