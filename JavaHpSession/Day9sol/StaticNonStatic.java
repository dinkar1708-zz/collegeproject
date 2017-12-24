class Coldrink
{
	static
	{
	System.out.println("This is static block");
	}
	static void pepse()
	{
	System.out.println("This is a pepse of static method");
	}
	void cocacola()
	{
	System.out.println("This is cocacola of non-static mehtod");
	}
}
class StaticNonStatic
{
	public static void main(String [] argv)
	{
	Coldrink ob=new Coldrink();
	Coldrink.pepse();ob.cocacola();
	}
}
	