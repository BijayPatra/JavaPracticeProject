package ThisKeywordExamples;

//Example without this keyword problem

class StudentTest 
{
	int rollno;
	String name;
	float fee;

	StudentTest(int rollno, String name, float fee) 
	{
		rollno = rollno;
		name = name;
		fee = fee;
	}
	void display() 
	{
		System.out.println(rollno + " " + name + " " +fee);
	}
}

class TestThis1 
{
	public static void main(String args[])
	{
		StudentTest s1 = new StudentTest(111, "ankit", 5000f);
		StudentTest s2 = new StudentTest(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}