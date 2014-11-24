package Level3;

public class Teacher extends Person{
	
	private int numCourses;
	private String[] courses;
	
	public Teacher(String name, String address)
	{
		super(name, address);
		numCourses = 0;
		courses = new String[30];
	}
	
	public String toString()
	{
		return "Teacher's name: " + getName()  + "Teacher's adress: " + getAddress();
	}

	public boolean addCourse(String course)
	{
		if(numCourses <= 30)
		{
			courses[numCourses] = course;
			numCourses++;
			return true;
		}
		else 
			return false;
	}
	
	public boolean removeCourse(String course)
	{
		for (int i = 0; i < courses.length; i++)
			if(courses[i].equals(course))
			{
				courses[i] = null;
				numCourses--;
			}
		
		String swap = "";
		for (int i = 0; i < courses.length-1; i++)
			if(courses[i]== null)
				{
				swap = courses[i];
				courses[i] = courses[i+1];
				courses[i+1] = swap;
				}
		return true;
	}

}
