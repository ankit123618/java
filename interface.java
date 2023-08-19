interface GrandFather
{public int hand=5;
	public void show_hv();
}
interface Father extends GrandFather
{public int leg=9;
	public void show_lv();
}
class Son implements Father
{
	 public void show_hv()
	{
		System.out.println(hand);
	}
	public void show_lv()
	{System.out.println(leg);
	}
}
class Interface
{
	public static void main(String[] args)
	{
		Son s=new Son();
		s.show_hv();
		s.show_lv();
	}
}

