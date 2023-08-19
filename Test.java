public class Test
{
	private int a;
	public void setA(int a)
	{
		this.a=a;
	}
	public void showA()
	{System.out.println("a= "+a);}
	public static void main(String[]args)
	{
		Test t=new Test();
		t.setA(10);
		t.showA();
	}
}


