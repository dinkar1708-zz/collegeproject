interface honda
{
 void mybike();
}
class pulser implements honda
{
 public void mybike()
 {
  System.out.println("This is my bike");
 }
}
class myinterface
{
 public static void main(String []argv)
 {
  pulser ob=new pulser();
  ob.mybike();
 }
}
