/*CREATE A CLASS CAR, AIRBAG, CAR CLASS CONTAINS NON STATIC METHOD WHICH RETURN AIRBAG OBJECT,
AIRBAG CONTAINS A NON STATIC METHOD PROTECT WITH PRINT STATEMENT PROTECT DRIVER,CREATE MAIN CLASS WHICH CONTAINS MAIN METHOD,
CREATE CAR OBJECT,GET THE AIRBAG OBJECT,CALL THE PROTECT METHOD*/
class car  
{
	public airbag getcar()
	{
		return new airbag();
	}

}
class airbag
{
	public void protect()


	{
		System.out.println("protect driver");
	}

}
class mainclass2
{
	public static void main(String[] args)
	{
		car c1=new car();
		airbag a1=c1.getcar();
		a1.protect();
	}
}

