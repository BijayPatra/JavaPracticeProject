package JavaProgramming;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> carList=new ArrayList<String>();
		carList.add("car1");
		carList.add("car2");
		carList.add("car3");
		carList.add("car4");
		carList.add("car5");
		carList.add("car6");
		carList.add("car7");
		
		for(int i=0;i<=carList.size();i++) {
			String carName=carList.get(i);
			System.out.println(carName);
		}

	}

}
