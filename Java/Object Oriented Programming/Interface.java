class MyCalculator implements AdvancedArithmetic {
	public int divisorSum(int n) {
		int sum = 0;
		for(int x = 1; x <= n; x++)
		{
			if(n % x == 0)
			{
				sum += x;
			}
		}
		return sum;
	}
}
