 abstract class demo 
{
	abstract public void test();
}

class sample extends demo 
{
	public void test()
	{
		System.out.println("test car..");
	}
}
class  mainclass1
{
	public static void main(String[] args) 
	{
		sample s1=new sample();
		s1.test();
	}
}


