package Level3;

public class Course {

	private String name;
	private int grade = -1;
	public Course(String n, int g)
	{
		name = n;
		grade = g;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getGrade()
	{
		return grade;
	}
}