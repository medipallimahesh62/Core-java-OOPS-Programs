class mainclass1 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		demo d=(demo) new demo1(); 
		demo1 d1=(demo1)d;
		d.start();
		d1.start();
		d1.test();
		System.out.println(d.i);
		System.out.println(d1.i);
		System.out.println(d1.j);

	}
}
