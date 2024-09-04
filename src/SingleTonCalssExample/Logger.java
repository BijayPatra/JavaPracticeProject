package SingleTonCalssExample;

/*Logging System
In a logging system, we may want to have only one instance of the logger,
as multiple loggers can cause inconsistent and hard-to-read logs. In this case,
we can apply the Singleton pattern to create a single logger instance that can be accessed
from different parts of the code.*/

public class Logger 
{
	private static Logger instance;

	private Logger()
	{
		// private constructor to prevent instantiation from outside the class
	}

	public static Logger getInstance() 
	{
		if (instance == null) 
		{
			instance = new Logger();
		}
		return instance;
	}

	public void log(String message) 
	{
		// log the message
	}

	public static void main(String[] args) 
	{
		Logger instance1 = Logger.getInstance();
		Logger instance2 = Logger.getInstance();
		System.out.println(instance1);
		System.out.println(instance2);
	}
}