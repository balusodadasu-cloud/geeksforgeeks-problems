class Solution {
	public boolean nonRepetitive(String s) {
		// code here
		HashSet<Character> hs = new HashSet<>();
		for (int i = 0; i<s.length(); i++) {
			hs.add(s.charAt(i));
		}
		for (int j = 1; j<s.length(); j++) {
			if (s.charAt(j - 1) == s.charAt(j))
				continue;
			if (!hs.contains(s.charAt(j)))
				return false;
			else {
				hs.remove(s.charAt(j - 1));
			}
		}
		return true;
	}
}
