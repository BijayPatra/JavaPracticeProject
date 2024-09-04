package ThisKeywordExamples;

//Program to illustrate This keyword is not Required

class StudentDemo
{
	int rollno;
	String name;
	float fee;

	StudentDemo(int r, String n, float f)
	{
		rollno = r;
		name = n;
		fee = f;
	}

	void display() 
	{
		System.out.println(rollno + " " + name + " " + fee);
	}
}

class TestThis3 
{
	public static void main(String args[]) 
	{
		Student s1 = new Student(111, "ankit", 5000f);
		Student s2 = new Student(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}