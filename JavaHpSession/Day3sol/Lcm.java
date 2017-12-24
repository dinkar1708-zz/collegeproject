  import javax.swing.JOptionPane;
  class Lcm
  {
      public static void main(String [] argv)
       {
           int num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the first number:-"));
           int num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the second number:-"));
           int lcm=0,i,temp;
           if(num1>num2)
           temp=num1;
           else
           temp=num2;
           for(i=2;i<=temp;i++)
           {
               if(num1%i==0&&num2%i==0)
               {               
               lcm=i;
               break;
               }
           }
           if(lcm==0)
           System.out.println("No lcm found");
           else
           System.out.println("Lcm is:"+lcm);
        }
 }