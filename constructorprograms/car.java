class car 
{
	public String cName;
	public String cModel;
	public car(String cName,String cModel)
	{
		this.cName=cName;
		this.cModel=cModel;
	}
	public void carinfo()
	{
		System.out.println("car name is " + cName);
		System.out.println("car model is " + cModel);
	}
	public static void main(String[] args) 
	{
		System.out.println("car information is .......");
		car c1=new car("maruthi suziki","shift");
	    c1.carinfo();
	}
}
