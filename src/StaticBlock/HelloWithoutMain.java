package StaticBlock;

public class HelloWithoutMain 
{
	// Static block
	static {
		System.out.println("Hello");
	}

	// Static variable initializer block
	static int x = initializeX();

	// Method to initialize x
	private static int initializeX() 
	{
		System.out.println("Initializing x");
		return 42;
	}
	public static void main(String[] args) {
		// The main method is not required for this specific output
	}
	
}