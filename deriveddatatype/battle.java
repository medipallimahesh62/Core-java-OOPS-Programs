class battle 
{
	public static void shoot(weapon w)
	{
		w.destroy();
		{
			if(w instanceof tanker)
			{
				tanker t1=(tanker)w;
				t1.blast();
			}
			else
			{
				gun g1=(gun)w;
				g1.fire();
			}
		}
	}
}
