package logicgate;
public class AndClass
{
	public int doOperationAnd(int a,int b) 
	{
	 if(a==0&&b==0)
	 {	
	 return 0;
	 }
	 else if(a==0&&b==1)
	 {	
	 return 0;
	 }
	 else if(a==1&&b==0)
	 {	
	 return 0;
	 } 
	 else if(a==1&&b==1)
	 {	
	 return 1;
	 }
	 return 0;
	}
} 
