class sample3 
{
	public static void main(String[] args) 
	{
	     int count=0;
		for(int i=0;i<=100;i++)
		{
			count++;
			if(count==5)
			{
				System.out.println("*");
				count=0;
			}
			else
			{
				System.out.println(i);
			}
		}
				
	}
}
