class rectangle 
{
	public int length;
	public double width;
	public double area;
	public rectangle(int length,double width)
	{
		this.length=length;
		this.width=width;
	}
	public void findArea()
	{
		area=length * width;
		System.out.println("area of rectangle is " +area);
	}

	public static void main(String[] args) 
	{
		rectangle r1=new rectangle(10,2.0);
		rectangle r2=new rectangle(11,3.0);
		r1.findArea();
		r2.findArea();

	}
}
