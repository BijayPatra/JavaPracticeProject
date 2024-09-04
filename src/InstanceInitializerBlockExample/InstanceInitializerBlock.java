package InstanceInitializerBlockExample;

class InstanceInitializerBlock 
{
	int speed;

	InstanceInitializerBlock() 
	{
		System.out.println("speed is " + speed);
	}

	{
		speed = 100;
	}

	public static void main(String args[])
	{
		InstanceInitializerBlock b1 = new InstanceInitializerBlock();
		InstanceInitializerBlock b2 = new InstanceInitializerBlock();
	}
}
