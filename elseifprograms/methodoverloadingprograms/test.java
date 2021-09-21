
class test
{
	public static void move(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void move(double a,int b)
	{
		System.out.println(a+b);
	}
	public static void move(int a,double b)
	{
		System.out.println(a+b);
	}
	public static void move(int a,int b,int c)
	{
		System.out.println(a+b
			);
	}
	public static void main(String[] args) 
	{
		move(10,20);
		move(8.4,5);
		move(3,3.3);
		move(2,2,2);
		System.out.println("Hello World!");

	}
}

