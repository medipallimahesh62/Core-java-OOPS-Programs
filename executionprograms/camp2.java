/*1.CREATE NON STATIC VAR
2.CREATE STATIC METHOD WHICH WILL PRINT NON STATIC VAR
3.CALL THE METHOD FROM MAIN MEHOD*/
class camp2
{
	public int a=10;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		c1.start();
	}
	public static void start()
	{
		System.out.println(c1.a);
		camp2 c1=new camp2();
		
		
	}

}
