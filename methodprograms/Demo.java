/*STATIC METHOD TO CALL NON STATIC METHOD BY CREATION OF OBJECT*/
class  Demo
{
	public static void main(String[] args) 
	{
		System.out.println("MAIN STARTS....");
		Demo obj=new Demo();
		obj.test();
		System.out.println("MAIN ENDS....");
	}
	public void test()
	{
		System.out.println("hello world....");
	}

}
