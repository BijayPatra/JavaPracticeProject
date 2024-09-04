package ThisKeywordExamples;

class StudentReal 
{
	int rollno;
	String name, course;
	float fee;

	StudentReal(int rollno, String name, String course) 
	{
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	StudentReal(int rollno, String name, String course, float fee) 
	{
		this(rollno, name, course);// reusing constructor
		this.fee = fee;
	}

	void display()
	{
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}
}

class StudentRealDemo
{
	public static void main(String args[])
	{
		StudentReal s1 = new StudentReal(111, "ankit", "java");
		StudentReal s2 = new StudentReal(112, "sumit", "java", 6000f);
		s1.display();
		s2.display();
	}
}