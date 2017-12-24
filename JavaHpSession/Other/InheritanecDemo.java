class Parent
{
	public void car()
	{
	System.out.println("Maruti");
	}
}
class Child extends Parent
{
	public void bike()
	{
	System.out.println("Pulsar");
	}
}  
class InheritanecDemo
{
	public static void main(String []ar)
	{
	Parent p=new Parent();
	p.car();
	//p.bike();//error
	Child c=new Child();	
	c.car();
	c.bike();
	Parent ob=new Child();	
	p.car();
	//p.bike();         
	
	}
}