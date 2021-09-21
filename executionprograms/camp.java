/*WAP FOR BELOW REQUIREMENTS
1.CREATE STATIC VAR
2.CREATE STATIC METHOD WHICH WILL PRINT STATIC VAR
3.CALL STATIC METHOD MAIN METHOD*/
class camp 
{
	public static int a=10;
	public static void main(String[] args) 
	{
		System.out.println("main starts..");
		start(a);
	}
	public static void start(int a)
	{
		System.out.println("hello world");
	}
}
