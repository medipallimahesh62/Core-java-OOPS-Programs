/* WAP FOR BELOW REQ
1.DEVELOP A CLASS WHICH CONTAINS COMPLETE METHOD AND INCOMPLETE METHOD
FINISH THE PROGRAM*/
abstract class demo2 
{
	public void start()
	{
		System.out.println("start main");
	}

	//abstract public void walk();
}
class sample extends demo2
{
	public void walk()
	{
		System.out.println("walk 10 km");
	}

}
class mainclass2
{
	public static void main(String[] args)
	{
		System.out.println("hello world..");
		sample s1=new sample();
		s1.walk();
		s1.start();
	}

}
