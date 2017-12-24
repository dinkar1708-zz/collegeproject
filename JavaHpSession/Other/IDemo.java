class Pulsar
{
  Pulsar()
  {
   System.out.println("This is pulsar constructor");
  }
}
class Honda extends Pulsar
{
 Honda()
 {
  super();
  System.out.println("This is honda constructor");
 }
}
public class IDemo
{
 public static void main(String []argv)
 {
   new Honda();
  }
}