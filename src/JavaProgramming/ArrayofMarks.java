package JavaProgramming;

public class ArrayofMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks= {60,70,80,90,100};
		System.out.println(marks.length);
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		
		marks[4]=99;
		System.out.println("After Replecing");
		System.out.println(marks[4]);
	}
}
