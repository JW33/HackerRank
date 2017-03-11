    static boolean isAnagram(String A, String B) {
        boolean retVal = true;
		if(A.length() == B.length())
		{
			char[] chars1 = A.toLowerCase().toCharArray();
			char[] chars2 = B.toLowerCase().toCharArray();
		
			Arrays.sort(chars1);
			Arrays.sort(chars2);
		
			String word1 = new String(chars1);
			String word2 = new String(chars2);
		
			if(word1.equals(word2))
			{
				retVal = true;
			}
			else
			{
				retVal = false;
			}
		}
		else
		{
			retVal = false;
		}
		return retVal;
    }
