import java.util.Scanner;
public class Interest
{
        public static void main(String a[])
	{
		Scanner s=new Scanner(System.in);
		float p,r,t,si;
		System.out.println("enter the value of principle");
		p=s.nextFloat();
		System.out.println("enter rate of interest");
	        r=s.nextFloat();
	        System.out.println("enter time");
	        t=s.nextFloat();
	        si=(p*r*t)/100;
	        System.out.println("simple interest is"+si);
	}
}
