/*WAP FOR BELOW REQUIREMENTS
1.CREATE non STATIC VAR
2.CREATE non STATIC METHOD WHICH WILL non STATIC VAR
3.CALL  METHOD from MAIN METHOD*/
class  camp1
{
	public int a=10;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
		
	}
	public void start()
	{
		System.out.println(a);
		camp1 c1=new camp1();
		c1.start();
		
	}
}
