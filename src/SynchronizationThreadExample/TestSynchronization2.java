package SynchronizationThreadExample;

//Java Synchronized Method

/*If you declare any method as synchronized, it is known as synchronized method.

Synchronized method is used to lock an object for any shared resource.
When a thread invokes a synchronized method, it automatically acquires 
the lock for that object and releases it when the thread completes its task.*/

//example of java synchronized method  
class TableTest 
{
	synchronized void printTable(int n) 
	{// synchronized method
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
}

class MyThreadTest extends Thread 
{
	TableTest t;

	MyThreadTest(TableTest t)
	{
		this.t = t;
	}

	public void run() 
	{
		t.printTable(5);
	}
}
class MyThreadTest1 extends Thread 
{
	TableTest t;

	MyThreadTest1(TableTest t) 
	{
		this.t = t;
	}

	public void run() 
	{
		t.printTable(100);
	}
}

public class TestSynchronization2 
{
	public static void main(String args[]) 
	{
		TableTest obj = new TableTest();// only one object
		MyThreadTest t1 = new MyThreadTest(obj);
		MyThreadTest1 t2 = new MyThreadTest1(obj);
		t1.start();
		t2.start();
	}
}