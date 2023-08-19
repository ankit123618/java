class Box
{
	private int lenght,breadth,height;
	public void setDimension(int l,int b,int h)
	{l=lenght;b=breadth;h=height;}
	public void showDimension()
	{
		System.out.println("l="+lenght);
	        System.out.println("b="+breadth);
	        System.out.println("h="+height);
	}
}
class Example
{
	public static void main(String[] args)
	{
		Box b1=new Box();
                b1.setDimension(10,20,30);
		b1.showDimension();
	}
}



