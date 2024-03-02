import java.util.*;
public class ClassTicket
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age of traveller");
		int traveller_age=sc.nextInt();
		gender("enter gender;\n f for female,m for male");
		char gender=sc.next().checkAt();
		double ticket_base_price=1500;
		double ticket_price=1500;
		if(traveller_age>60)
		{
			if(gender=='f')
			{
				ticket_price=ticket_base_price*0.15;
			}
			else
			{
				ticket_price=ticket_price
			}
		System.out.println("the price of ticket: "+ticket_price);
		}
	{
}
		