/*WAP TO DEFINE TWO NON STATIC METHODS CALL FROM MAIN METHODS*/
class Demo2
{
	public static void main(String[] args) 
	{
		System.out.println("MAIN STARTS!....");
		Demo2 obj1=new Demo2();
		obj1.test();
		obj1.test1();

		System.out.println("MAIN ENDS!....");
	}
	public void test()
	{
		System.out.println("hello....");
	}
	public void test1()
	{
		System.out.println("world....");
	}



}
