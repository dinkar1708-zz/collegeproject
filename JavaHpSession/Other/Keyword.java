class Parent
{
  int x;
  Parent(int x)
  {
	this.x=x;
        System.out.println("This is called by this.x: "+x);
  }
}
/*class Child extends Parent
{
      int x;
        Child(int y)
	{
	x=y;
	System.out.println(x);
	}
	Child(int a,int b)
	{ 
	this(100);//Calling of the same class constructor.
	}       
} */
class Other extends Parent
{
	Other()  
	{
	super(5);//Calling Parent class constructor
	}
	public void show()
	{
	System.out.println("This is called by super.this: "+super.x);
	}
}
class Keyword 
{
	public static void main(String []ar)
	{		 
//	Child c1=new Child(1,2);
	Other ob=new Other();	         		
	ob.show();
	}
}