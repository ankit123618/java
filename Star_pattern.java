class Star_pattern
{
	public static void main(String[] args)
	{
		for(int i=0;i<10;i++)
			{
				for(int j=0;j<i;j++)
					System.out.print(i);
				 System.out.print("\n");

			}
		System.out.println("\n");
		for(int i=9;i>0;i--)
                        {
                                for(int j=9;j>i;j--)
                                        System.out.print(i);
                                 System.out.print("\n");

                        }
                System.out.println("\n");

	}
}
