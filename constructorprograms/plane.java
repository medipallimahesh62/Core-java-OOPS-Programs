class plane
{
	public int speed;
	public int time;
	public int distance;
	public plane(int speed,int time)
	{
		this.speed=speed;
		this.time=time;
	}
	public void caluclate()
	{
		distance=speed * time;
		System.out.println("distance covered by aeroplane is  " + distance + " km/h... ");
	}
		public static void main(String[] args) 
	{
		plane p1=new plane(240,5);
		plane p2=new plane(180,3);
		p1.caluclate();
		p2.caluclate();
	}
}
