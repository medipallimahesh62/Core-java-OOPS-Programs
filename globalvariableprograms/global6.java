/*static and non static of same datatype, static and non static method,access all variables and methods in main*/
class global6 
{
	public static int a=10;
	public int b=29;
	public static void main(String[] args) 
	{
		System.out.println("MAIN STARTS.....");
		System.out.println("MAIN endS.....");
		global6 g1=new global6();
		g1.start1();
		start();

	}
	public static void start()
	{
		System.out.println(a);
	}
	public void start1()
	{
		System.out.println(b);
	}

}
