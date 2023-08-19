class Block
{
	int a;
	{
		System.out.println("hello the value of a is "+a);
		a=5;
	}
	public Block()
	{
		System.out.println("hello again the value of a is "+a);
	}
	public static void main(String[] args)
	{
		Block b=new Block();
	}
}
