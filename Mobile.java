class Mobile
{
	String first()
	{
		String name="Samsung";
		double price=6478.50;
		return name+""+price;
	}
	
	String second(String name,double price)
	{
		return name+""+price;
	}
	
	public static void main(String [] args)
	{
		Mobile m1=new Mobile();
		String result1=m1.first();
		String result2=m1.second("Apple",84265.50);
		System.out.println(result1);
	}
	
	
}