/*two non static var*/
class global4 
{
	public int a=34;
	public int b=35;
	public static void main(String[] args) 
	{
		System.out.println("MAIN STARTS...");
		global4 g1=new global4();
		System.out.println(g1.a);
		System.out.println(g1.b);
		
		System.out.println("MAIN ENDS...");
		
	}

}
