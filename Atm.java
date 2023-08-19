package atm;
import java.util.*;
class Module
{
	private float balance;
	private float withdrawl;
	private float remaining_amount;
	public void set_balance(float b)
	{balance=b;}
	public void enter_withdrawl(float w)
	{withdrawl=w;}
        public void  set_ra()
	{float r=balance-withdrawl;
	  System.out.println(r);
	}

}
class Atm
{
	public static void main(String[] args)
	{
		Module  m=new Module();
		Scanner i=new Scanner(System.in);
		System.out.println("transfer amount in account");
		m.set_balance(i.nextFloat());
		System.out.println("enter withdrawl amount");
		m.enter_withdrawl(i.nextFloat());
		m.set_ra();
	}
}
