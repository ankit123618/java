package cal;
class Sum
{
	private int a,b;
	public void setValues(int x,int y)
	{
		a=x;
		b=y;
	}
	public void add()
	{
		System.out.println(a+b);
	}
}
class Calculator
{
	public static void main(String[] args)
	{
		Sum s=new Sum();
		s.setValues(10,20);
		s.add();
	}
}
