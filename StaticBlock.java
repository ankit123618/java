class StaticBlock
{
	private static int a;
	static
	{
		System.out.println("hello "+a);
		a=5;
	}
	public StaticBlock()
	{
		System.out.println("hello again "+a);
	}
	public static void main(String[] args)
	{
		new StaticBlock();
	}
}
