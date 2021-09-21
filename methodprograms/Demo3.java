/*WPT DEFINE ONE STATIC AND NON STATIC METHOD FROM MAIN METHOD*/
class  Demo3
{
	public static void main(String[] args) 
	{
		System.out.println("MAIN STARTS...");
		Demo3 d1=new Demo3();
		start();
		d1.start1();
	}
	public static void start()
	{
		System.out.println("HELLO WORLD...");
	}
	public void start1()
	{
		System.out.println("THIS IS MAHESH...");
	}


}
