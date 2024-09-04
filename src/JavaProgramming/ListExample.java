package JavaProgramming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> markList=new ArrayList<Integer>();
		//List<Integer> markList=new LinkedList<Integer>();
		
		markList.add(60);
		markList.add(70);
		markList.add(80);
		markList.add(90);
		markList.add(100);
		markList.add(110);
		
		System.out.println(markList.size());
		
		System.out.println(markList.get(0));
		System.out.println(markList.get(1));
		System.out.println(markList.get(2));
		System.out.println(markList.get(3));
		System.out.println(markList.get(4));
		System.out.println(markList.get(5));

	}

}
