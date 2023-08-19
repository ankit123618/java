package arrays;
import java.util.*;
public class Varius
{
        int num[]=new int[10];
        float real[];
	char ch[];
	public void set_num()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integers");
		for(int i=0;i<10;i++)
			num[i]=sc.nextInt();
		 System.out.println("you have entered: ");
		for(int i=0;i<10;i++)
			System.out.println(num[i]);
	}
}

