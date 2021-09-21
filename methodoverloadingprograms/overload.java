/*to overload static and non static*/
class overload 
{
	public static void move(int a,double b)
	{
		System.out.println(a+b);
	}
	public  void move(int a,int c,double b)
	{
		System.out.println(a+c+b);
	}
	public static void main(String[] args) 
	{
		overload m1=new overload();
		move(1,2.3);
		m1.move(1,2,3.4);
		System.out.println("method overloading excuted");
	}
}
