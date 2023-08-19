class HarmonicSeries
{
	private float n;
	public void get_n(int num)	{
		n=num;
	}
	public void cal_hs()
	{
		 float hs=1+1/2+1/3+1/n;
		 System.out.println(hs);
	}
	public static void main(String[] args)
	{
		HarmonicSeries h=new HarmonicSeries();
		h.get_n(15);
		h.cal_hs();
	}
}
