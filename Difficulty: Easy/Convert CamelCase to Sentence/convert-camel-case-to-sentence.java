class Solution {
	public String amendSentence(String s) {
		// code here
		StringBuilder ans = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				
				if (i != 0) {
					ans.append(' ');
				}
				
				ans.append((char)(ch + 32));
			}
			else {
				ans.append(ch);
			}
		}
		return ans.toString();
	}
}
