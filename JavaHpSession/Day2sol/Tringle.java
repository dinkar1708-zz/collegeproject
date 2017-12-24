class TringleChar
{
    TringleChar()
    {
         int i,j,k=0,l=-1;
         char str[]={'A','B','C','D','E'};
         for(i=0;i<5;i++)
         {
             for(j=4;j>i;j--)
             System.out.print(" ");
             for(j=0;j<=i;j++)
             System.out.print(str[k++]);                           
             k=0;             
             k=l;
             for(j=0;j<i;j++)
             System.out.print(str[k--]);
             System.out.println();
             k=0;l++;
        }
    }
}
public class Tringle
{
	public static void main(String []argv) 
	{
	new TringleChar();
	}
}