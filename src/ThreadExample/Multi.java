package ThreadExample;
//1) Java Thread Example by extending Thread class

class Multi extends Thread 
{
	public void run()
	{
		System.out.println("thread is running...");
	}

	public static void main(String args[])
	{
		Multi t1 = new Multi();
		t1.start();
	}
}
