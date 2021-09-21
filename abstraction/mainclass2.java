interface demo 
{
	void test();
}
class sample implements demo
{
	public void test()
	{
		System.out.println("test a car");
	}		
}
class run
{
	public static demo getObject()
	{
		demo demo=new sample();
		return demo;
	}
}
class mainclass2
{
	public static void main(String[]args)
	{
		demo d1=run.getObject();
		d1.test();
	}
}
