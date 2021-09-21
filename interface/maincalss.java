class maincalss 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		sample s1=new sample();
		s1.test();
	}
}
interface demo 
{
	void test();
}
class  sample implements demo
{
	public void test()
	{
		System.out.println("test a car");
	}
}