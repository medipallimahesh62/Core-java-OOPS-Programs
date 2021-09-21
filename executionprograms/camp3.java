
/*1.CREATE STATIC VAR
2.CREATE NON STATIC METHOD WHICH WILL PRINT STATIC VAR
3.CALL THE METHOD FROM MAIN METHOD*/
class  camp3
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		camp3 c1=new camp3();
		c1.run();
	}

	public static int a=10;
	public void run()
	{
		System.out.println(a);
	}

}
