import javax.swing.JOptionPane;
class Conversion1
{
 static float amountInDollar,amountInRupees,distanceInMeters,distancKilometers,tempInCelcius,tempInFarenhiet;
 static float  dollarToRupees(float amountInDollar1)
 {
  amountInDollar=amountInDollar1;
  return amountInDollar*50f;
 }
 static float  rupeesToDollar(float amountInRupees1)
 {
  amountInRupees=amountInRupees1;
  return amountInRupees/50f;
 }
 static float  meterToKilometer(float distanceInMeters1)
 {
  distanceInMeters=distanceInMeters1;
  return distanceInMeters/1000f;
 }
 static float  kilometerToMeter(float distancKilometers1)
 {
  distancKilometers=distancKilometers1;
  return distancKilometers*1000f;
 }
 static float celciusToFarenhiet(float tempInCelcius1)
 {
  tempInCelcius=tempInCelcius1;
  return 9*(tempInCelcius)/32+5;
 }
 static float farenhietToCelcius(float tempInFarenhiet1)
 {
  tempInFarenhiet=tempInFarenhiet1;
 return (32*tempInFarenhiet-5)/9;
 }

}
class TestConversion1
{
 public static void main(String [] argv)
 {
  do
 {
  int ch=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your choice:"));		    
  new Menu();
  switch(ch)
  {
   case 1:
  float amountInDollar=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the amount in dollar"));		    
  float amountInRupees1=Conversion1.dollarToRupees(amountInDollar);
  System.out.println("The amount in Rupees=Rs."+amountInRupees1);
  break;
   case 2:
  float amountInRupees=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the amount in Rupees"));		    
  float amountInDollar1=Conversion1.rupeesToDollar(amountInRupees);
  System.out.println("The amount in Dollar=Rs."+amountInDollar1);
   break;
   case 3:
  float distanceInMeters=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the distance in Meter"));		    
  float distancKilometers1=Conversion1.meterToKilometer(distanceInMeters);
  System.out.println("The distance in kilometer=Km"+distancKilometers1);
  case 4:
  float distancKilometers=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the distanc in Kilomerer"));		    
  float distanceInMeters1=Conversion1.kilometerToMeter(distancKilometers);
  System.out.println("The amount in Kilometer="+distanceInMeters1);  
  break;
   case 5:
  float tempInCelcius=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the temperature in celcius"));		    
  float tempInFarenhiet1=Conversion1.celciusToFarenhiet(tempInCelcius);
  System.out.println("The temperature in farenhiet="+tempInFarenhiet1);  
  break;
   case 6: 
  float tempInFarenhiet=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the temperature in Farenhiet"));		    
  float tempInCelcius1=Conversion1.farenhietToCelcius(tempInFarenhiet);
  System.out.println("The temperature in celcius="+tempInCelcius1);  
  break;
   case 7:System.exit(0);
   break;
   default:System.out.println("Wrong choice.");
  }
  }while(true);
 }
}
class Menu
{
 Menu()
 {
  System.out.println("1.Dollar to Rupees.\n2.Rupees to Dollar.\n3.Meter to kilometer.");
  System.out.println("4.Kilomoter to meter.\n5.Celcius to Farenhiet.\n6.Farenhiet to Celcius.\n7.Exit");
 }
}