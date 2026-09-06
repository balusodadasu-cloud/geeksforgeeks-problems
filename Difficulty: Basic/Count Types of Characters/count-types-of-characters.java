class Sol {
	int[] count(String s) {
		// your code here
		int upper = 0;
		int lower = 0;
		int special = 0;
		int digit = 0;
		for (int i = 0; i<s.length(); i++)
			{
			char ch = s.charAt(i);
			if (Character.isLowerCase(ch))
				{
				lower++;
			}
			else if (Character.isUpperCase(ch))
				{
				upper++;
			}
			else if (Character.isDigit(ch))
				{
				digit++;
			}
			else
				{
				special++;
			}
		}
		int[] arr = new int[4];
		arr[0] = upper;
		arr[1] = lower;
		arr[2] = digit;
		arr[3] = special;
		return arr;
	}
}
