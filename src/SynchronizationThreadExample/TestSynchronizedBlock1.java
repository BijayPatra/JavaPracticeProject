package SynchronizationThreadExample;

//Example of Synchronized Block

class TableDemo 
{
	void printTable(int n) 
	{
		synchronized (this) {// synchronized block
			for (int i = 1; i <= 5; i++) 
			{
				System.out.println(n * i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}// end of the method
}

class MyThread3 extends Thread 
{
	TableDemo t;

	MyThread3(TableDemo t) 
	{
		this.t = t;
	}

	public void run() 
	{
		t.printTable(5);
	}
}

class MyThread4 extends Thread 
{
	TableDemo t;

	MyThread4(TableDemo t)
	{
		this.t = t;
	}

	public void run() 
	{
		t.printTable(100);
	}
}

public class TestSynchronizedBlock1 
{
	public static void main(String args[])
	{
		TableDemo obj = new TableDemo();// only one object
		MyThread3 t1 = new MyThread3(obj);
		MyThread4 t2 = new MyThread4(obj);
		t1.start();
		t2.start();
	}
}
