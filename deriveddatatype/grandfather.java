class grandfather
{
	public static father getfather()
	{
		return new father();
	}
	public static son getson()
	{
		return new son();
	}
}
class father
{
	public String str="hello";
}
class son
{
	public void sample()
	{
		System.out.println("medipalli mahesh");
	}

}
class mainclass
{
	public static void main(String[]args)
	{
		father f1=grandfather.getfather();
		System.out.println(f1.str);
		son s1=grandfather.getson();
		s1.sample();
	}
}
