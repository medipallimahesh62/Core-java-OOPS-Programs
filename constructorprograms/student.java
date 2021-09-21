class student 
{
	public String Name;
	public int Marks;
	public double Percentage;
	public String Branch;
	public int Rollno;
	public student(String Name,int Marks,double Percentage,String Branch,int Rollno)
	{
		this.Name=Name;
		this.Marks=Marks;
		this.Percentage=Percentage;
		this.Branch=Branch;
		this.Rollno=Rollno;
	}
	public  void StudentInfo()
	{

			System.out.println("STUDENT NAME IS " + Name);
			System.out.println("STUDENT MARKS IS " + Marks);
			System.out.println("STUDENT PERCENTAGE IS " + Percentage);
			System.out.println("STUDENT BRANCH IS " + Branch );
			System.out.println("STUDENT ROLLNO IS " + Rollno);
	}

	public static void main(String[] args) 
	{
		System.out.println("STUDENT INFORMATION IS");
		student s1=new student("MaheshMedipalli",950,95.00,"CSE",1610562);
		s1.StudentInfo();
	}
}
