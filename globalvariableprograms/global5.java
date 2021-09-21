/*WP CREATE TWO NON STATIC VAR OF DIFF DATATYPES AND PRINT IN MAIN*/
class global5 
{
	public String a="mahesh medipalli";
	public char  b= '@';
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		global5 g1=new global5();
		System.out.println("MAIN STARTS");
		System.out.println(g1.a);
		System.out.println(g1.b);
	}
}
