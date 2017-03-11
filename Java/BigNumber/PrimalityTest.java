/* Add Digits */ success [runtime beats 13.45% of other C# submissions] what on earth could be optimized here?

public class Solution {
    public int AddDigits(int num) {
        while(num >= 10)
            {
                char[] chars = num.ToString().ToCharArray();
                num = 0;
                foreach(char c in chars)
                {
                    num += (int)Char.GetNumericValue(c);
                }
            }
            return num;
    }
}
