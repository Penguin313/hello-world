class Sample2
{
	static int a=10;
	int x=20;
	int y=30;
}
class TestSample2
{
	public static void main(String[]args)
	{
		System.out.println(Sample2.a);
		
		Sample2 s2=new Sample2();
		System.out.println(s2.x);
		System.out.println(s2.y);
		
		s2.x=40;
		s2.y=60;
		System.out.println(s2.x+s2.y);
	}
}