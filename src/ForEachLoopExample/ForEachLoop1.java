package ForEachLoopExample;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> carList=new ArrayList<String>();
		
		carList.add("BMW");
		carList.add("Mecetize");
		carList.add("Maruti");
		carList.add("Jaguar");
		carList.add("Enova");
		carList.add("Swift");
		
		for (String carname : carList) {
			System.out.println(carname);
			
		}
		
		

	}

}
