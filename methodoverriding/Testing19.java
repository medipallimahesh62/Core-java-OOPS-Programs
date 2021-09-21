class Cricket 
{
	int runs;
}
class Testing19
{

	public static void main(String[] args) 
	{
		Cricket c1=new Cricket();
		c1.runs=250;
		Cricket c2;
		c2=c1;
		c2.runs=300;
		System.out.println("runs"+c1.runs);
	}
}
