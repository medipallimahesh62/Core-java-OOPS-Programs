class addition 
{
	public int a;
	public double b;
	public double c;
	public  addition(int a,double b)
	{
		this.a=a;
		this.b=b;
	}
	public void cal()
	{
		c=a+b;
		System.out.println("addition of numbers  is " +c);
	}


		
	public static void main(String[] args) 
	{
		addition d1=new addition(10,2.2);
		d1.cal();
	}
}
