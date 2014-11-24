package Level3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Student extends Person {

	private int numCourses;
	private Map<String, Course> completedCourses = new HashMap<String, Course>();

	public Student(String name, String address) 
	{
		super(name, address);
		numCourses = 0;
	}

	public boolean addCompletedCourse(Course course) 
	{
		if (completedCourses.containsKey(course.getName()) && numCourses <= 30) 
		{
			if (course.getGrade() > completedCourses.get(course.getName())
					.getGrade())
			{
				completedCourses.replace(course.getName(), course);
				return true;
			} else
				return false;
		}
		else 
		{
			completedCourses.put(course.getName(), course);
			numCourses++;
			return true;
		}
	}

	public void printGrades()
	{
		Collection<Course> printGrades = completedCourses.values();
		Iterator<Course> iterGrades = printGrades.iterator();

		while(iterGrades.hasNext())
		{
			Course course = iterGrades.next();
			System.out.println(course.getName() + ": " + course.getGrade());
		}
	}

	public double getAverage()
	{
		Collection<Course> gradesList = completedCourses.values();
		Iterator<Course> iterGrades = gradesList.iterator();
		double average = 0;

		while(iterGrades.hasNext())
		{
			Course course = iterGrades.next();
			average += course.getGrade();
		}
		
		return average / numCourses;
	}
}
