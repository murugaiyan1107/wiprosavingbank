import java.util.ArrayList;
import java.util.Date;


public class MyMain 
{
	public static void main(String[] args) 
	{
		
		WiproSavingBank arun=new WiproSavingBank("Arun",new Date("23-may-1995"),"2, Wall Street, Sector 4, Patia, Bhubaneswar",5000.00f);
		WiproSavingBank bala=new WiproSavingBank("Bala",new Date("17-jun-1994"),"4, Kovil Street, Sector 2, shree vighar, Bhubaneswar",6000.00f);
		
		ArrayList<String> arunMiniStatement=new ArrayList<String>();
		ArrayList<String> balaMiniStatement=new ArrayList<String>();
		
		
		arunMiniStatement.add(arun.deposit(4000));
		
		
		arunMiniStatement.add(arun.withdrawal(3000));
		System.out.println("Arun Balance:"+arun.balEnquiry());
		
		
		balaMiniStatement.add(bala.deposit(5000));
		
		balaMiniStatement.add(bala.withdrawal(2000));
	
		balaMiniStatement.add(bala.withdrawal(5000));
		System.out.println("Bala Balance:"+bala.balEnquiry());
		
		System.out.println("Arun Mini Statement");
		for(String t:arunMiniStatement)
		{
			System.out.println(t);
		}
		
		System.out.println("Bala Mini Statement");
		for(String t:balaMiniStatement)
		{
			System.out.println(t);
		}
				
		System.out.println(arun);
		System.out.println(bala);

	}

}
