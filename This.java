class A
{
	int x;
	A(int x)
	{this.x=x;}
	public void display()
	{System.out.println("x= "+x);}
}
class B extends A
{int y;
	B(int x,int y)
	{super(x);
		this.y=y;}
	public void show()
	{System.out.println("x= "+x);
		System.out.println("y= "+y);
	}
}
class This
{
	public static void main(String[] args)
	{
		B b1=new B(10,20);
		b1.display();
		b1.show();
	}
}
