package ThisKeywordExamples;

//Rule: Call to this() must be the first statement in constructor.

class StudentCall 
{
	
		int rollno;
		String name, course;
		float fee;

		StudentCall(int rollno, String name, String course) 
		{
			this.rollno = rollno;
			this.name = name;
			this.course = course;
		}

		StudentCall(int rollno, String name, String course, float fee) 
		{
			this(rollno, name, course);
			this.fee = fee;
			//this(rollno, name, course);// C.T.Error
		}

		void display() 
		{
			System.out.println(rollno + " " + name + " " + course + " " + fee);
		}
}

class TestThisDemo 
{
	public static void main(String args[])
	{  
		StudentCall s1=new StudentCall(111,"ankit","java");  
		StudentCall s2=new StudentCall(112,"sumit","java",6000f);  
		s1.display();  
		s2.display();  
	}
}