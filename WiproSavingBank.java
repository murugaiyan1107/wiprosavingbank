import java.util.Date;


public class WiproSavingBank 
{
	String name;
	Date dob;
	String address;
	float avail_bal;
	static float min_bal=5000.00f;
	
	public WiproSavingBank(String name, Date dob, String address,
			float avail_bal) 
	{
		super();
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.avail_bal = avail_bal;
	}
	
	String deposit(int amount)
	{
		avail_bal+=amount;
		String s="Deposited amount:"+amount+"\t Available balance:"+avail_bal;
		return s;
	}
	
	String withdrawal(int amount)
	{
		String s=new String();
		if((avail_bal-amount)<min_bal)
		{
			s="Withdrawl failed due to insufficient balance \t Available balance:"+avail_bal;
		}
		else
		{
			avail_bal-=amount;
			s="Withdrawal amount:"+amount+"\t Available balance:"+avail_bal;
		}
		
		return s;
	}
	
	float balEnquiry()
	{
		return avail_bal;
	}

	@Override
	public String toString() {
		return "WiproSavingBank [name=" + name + ", dob=" + dob + ", address="
				+ address + ", avail_bal=" + avail_bal + "]";
	}
	

}
