package SingleTonCalssExample;

import java.sql.Connection;

/*Database Connection
 * 
In a web application that uses a database, we may want to create a single database connection instance 
to avoid creating multiple connections that can cause performance issues.
By using the Singleton pattern, we can create a single database connection instance
that can be shared across the application.
*/


public class DatabaseConnection 
{
	private static DatabaseConnection instance;

	private DatabaseConnection() 
	{
		// private constructor to prevent instantiation from outside the class
	}

	public static DatabaseConnection getInstance() 
	{
		if (instance == null) 
		{
			instance = new DatabaseConnection();
		}
		return instance;
	}

	public Connection getConnection()
	{
		return null;
	}

	public static void main(String[] args)
	{
		DatabaseConnection instance1 = DatabaseConnection.getInstance();
		DatabaseConnection instance2 = DatabaseConnection.getInstance();
		System.out.println(instance1);
		System.out.println(instance2);
	}
}