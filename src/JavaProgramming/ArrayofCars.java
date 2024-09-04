package JavaProgramming;

public class ArrayofCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] carnames= {"car1","car2","car3","car4","car5"};
		
		int count=carnames.length;
		System.out.println(count);
		
		System.out.println(carnames[0]);
		System.out.println(carnames[1]);
		System.out.println(carnames[2]);
		System.out.println(carnames[3]);
		System.out.println(carnames[4]);
		//System.out.println(carnames[5]);
		
		carnames[0]="NewCar";
		System.out.println(carnames[0]);
	}

}
