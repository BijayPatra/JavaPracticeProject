package MethodOverLoadingExamples;

public class MethodOverloading4 
{
	public void strMethod(String s) 
	{
		System.out.println("This is srt arg strMehod:");
	}
	public void strMethod(StringBuffer sb)
	{
		System.out.println("This is sb arg Method:");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MethodOverloading4 md=new MethodOverloading4();
		md.strMethod("Bijay");
		md.strMethod(new StringBuffer("Bijay"));
		//md.strMethod(null);
	}

}
