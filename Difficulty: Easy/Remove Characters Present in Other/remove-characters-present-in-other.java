class Solution {
	public String removeChars(String str1, String str2) {
		// code here
		HashSet<Character> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		
		for (char ch : str2.toCharArray()) {
			
			set.add(ch);
		}
		
		for (int i = 0 ; i < str1.length() ; i++) {
			
			if (!set.contains(str1.charAt(i))) {
				
				sb.append(str1.charAt(i));
			}
		}
		return sb.toString();
	}
}
