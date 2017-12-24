import java.util.Scanner;
 class Electric
 {
     String name;
     long energyConsumed;
     public void bill(String n,long e)
     {
         double charges;
         name=n;
         energyConsumed=e;
         System.out.println("Name of the custemer\tTotal charges");
         if(energyConsumed>0&&energyConsumed<=100)
         {
         charges=(energyConsumed*.40);
         System.out.println(name+"\t\t"+"Rs."+charges);
         return;
        }
        else if(energyConsumed<=200)
        {
            charges=energyConsumed*.50;
            System.out.println(name+"\t\t"+"Rs."+charges);
            return;
        }
        else  
        {
            charges= energyConsumed*.60;
            if(charges>=250)
            charges+=15*charges/100;
            System.out.println(name+"\t\t"+"Rs."+charges);           
        }
            
    }
 }
 public class ElectricBill
 {
     public static void main(String []argv)
     {
         long energy;
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the name of user:-");
         String name = scanner.nextLine();        
         System.out.println("Enter the number of unit consumed:-");
         energy = Long.parseLong(scanner.nextLine());
         Electric ob=new Electric();
         ob.bill(name,energy);
     }
 }