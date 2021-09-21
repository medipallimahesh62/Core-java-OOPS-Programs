class start
{
	public static double add(int a,double b)
	{
		return a-b;
	}
	public static double add(int a,double b,int c)
	{
		return a+b-c;
	}
	
}
class mainclass
{
	public static void main(String[]args)
	{
		double i=start.add(10,2.5);
		double j=start.add(20,2.5,4);
		System.out.println(i);
		System.out.println(j);
	}
}
