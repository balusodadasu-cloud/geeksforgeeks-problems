class Solution {
	public static boolean isPalindrome(String s) {
		// code here
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String a = sb.toString();
		if (s.equalsIgnoreCase(a))
			{
			return true;
		}
		return false;
	}
}
