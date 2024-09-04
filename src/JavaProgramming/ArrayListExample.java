package JavaProgramming;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> carList=new ArrayList<String>();
		carList.add("BMW");
		carList.add("Mecetize");
		carList.add("Maruti");
		carList.add("Jaguar");
		carList.add("Enova");
		carList.add("Swift");
		
		
		
		int count=carList.size();
		System.out.println(count);
		
		System.out.println(carList);
		
		System.out.println(carList.get(0));
		
		String data=carList.get(3);
		System.out.println(data);
		
		//System.out.println(carList.get(6));
		
		carList.set(3, "New Car");
		System.out.println("After Replacing");
		
		System.out.println(carList.get(3));
		
		carList.remove(5);
		System.out.println("After Removing a element");
		System.out.println(carList.size());
	}

}
