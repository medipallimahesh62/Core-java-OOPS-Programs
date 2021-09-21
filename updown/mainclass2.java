class mainclass2 
{
	public static void main(String[] args) 
	{
		start s1=new start1();
		s1.run();
		start1 s2=(start1) s1;
		s2.run();
		s2.test(); 
	}
}
