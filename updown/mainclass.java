class mainclass  
{
	public static void main(String[] args) 
	{
		P p1=(P)new Q();
		Q q1=(Q)p1;
		System.out.println(p1.i);
		System.out.println(q1.i);
		System.out.println(q1.j);
		System.out.println("*******************");
		P p2=(P)new R();
		R r1=(R)p2;
		System.out.println(p2.i);
		System.out.println(r1.i);
		System.out.println(r1.k);

	}
}
