class myCalculator {
	public static int power(int n, int p) throws Exception
	{
		if(0 > n || 0 > p)
		{
			throw new Exception("n and p should be non-negative");
		}
		return (int) Math.pow(n, p);
	}
}
