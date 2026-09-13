class Solution {
	public String maximumFrequency(String s) {
		// Code here
		String[] word = s.split(" ");
		HashMap<String, Integer> mp = new HashMap<>();
		
		for (int i = 0; i < word.length; i++) {
			mp.put(word[i], mp.getOrDefault(word[i], 0) + 1);
		}
		
		String count = word[0];
		int fre = mp.get(count);
		
		for (String i : word) {
			int freq = mp.get(i);
			
			if (freq > fre) {
				fre = freq;
				count = i;
			}
		}
		
		return count + " " + fre;
	}
}
