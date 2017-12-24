import java.util.Scanner;
class Occurence
{
 String s=new String();
 Occurence(String str)
 {
  int i,k,a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,ii=0,j=0,kk=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,ss=0;
  int t=0,u=0,v=0,w=0,x=0,y=0,z=0;
  int []pos1=new int[100];
  int []pos2=new int[100];
  int []pos3=new int[100];
  int []pos4=new int[100];
  int []pos5=new int[100];
  int []pos6=new int[100];
  int []pos7=new int[100];
  int []pos8=new int[100];
  int []pos9=new int[100];
  int []pos10=new int[100];
  int []pos11=new int[100];
  int []pos12=new int[100];
  int []pos13=new int[100];
  int []pos14=new int[100];
  int []pos15=new int[100];
  int []pos16=new int[100];
  int []pos17=new int[100];
  int []pos18=new int[100];
  int []pos19=new int[100];
  int []pos20=new int[100];
  int []pos21=new int[100];
  int []pos22=new int[100];
  int []pos23=new int[100];
  int []pos24=new int[100];
  int []pos25=new int[100];
  int []pos26=new int[100];
  s=str;
  for(i=0;i<s.length();i++)
  {   
   if(s.charAt(i)=='a')
   {
    pos1[a]=i;
    a++;
   }
   else if(s.charAt(i)=='b')
   {
   pos2[b]=i;
   b++;
   }
   else if(s.charAt(i)=='c')
   {
    pos3[c]=i;
    c++;
   }
   else if(s.charAt(i)=='d')
   {
   pos4[d]=i;
   d++;
   }
   else if(s.charAt(i)=='e')
   {
    pos5[e]=i;
    e++;
   }
   else if(s.charAt(i)=='f')
   {
   pos6[f]=i;
   f++;
   }
   else if(s.charAt(i)=='g')
   {
    pos7[g]=i;
    g++;
   }
   else if(s.charAt(i)=='h')
   {
   pos8[h]=i;
   h++;
   }
   else if(s.charAt(i)=='i')
   {
    pos9[ii]=i;
    ii++;
   }
   else if(s.charAt(i)=='j')
   {
   pos10[j]=i;
   j++;
   }
   else if(s.charAt(i)=='k')
   {
    pos11[kk]=i;
    kk++;
   }
   else if(s.charAt(i)=='l')
   {
   pos12[l]=i;
   l++;
   }
   else if(s.charAt(i)=='m')
   {
    pos13[m]=i;
    m++;
   }
   else if(s.charAt(i)=='n')
   {
   pos14[n]=i;
   n++;
   }
   else if(s.charAt(i)=='o')
   {
    pos15[o]=i;
    o++;
   }
   else if(s.charAt(i)=='p')
   {
   pos16[p]=i;
   p++;
   }
   else if(s.charAt(i)=='q')
   {
    pos17[q]=i;
    q++;
   }
   else if(s.charAt(i)=='r')
   {
   pos18[r]=i;
   r++;
   }
    else if(s.charAt(i)=='s')
   {
    pos19[ss]=i;
    ss++;
   }
   else if(s.charAt(i)=='t')
   {
   pos20[t]=i;
   t++;
   }
   else if(s.charAt(i)=='u')
   {
    pos21[u]=i;
    u++;
   }
   else if(s.charAt(i)=='v')
   {
   pos22[v]=i;
   v++;
   }
   else if(s.charAt(i)=='w')
   {
    pos23[w]=i;
    w++;
   }
   else if(s.charAt(i)=='x')
   {
   pos24[x]=i;
   x++;
   }   
   else if(s.charAt(i)=='y')
   {
   pos25[y]=i;
   y++;
   }
   else
   {
    pos26[z]=i;
    z++;
   }    
  } 
   System.out.println("Position of a=");
   System.out.print("[");
   for(k=0;k<a;k++)
   {
    System.out.print(pos1[k]+",");    
   }  
   System.out.println("]");
   System.out.println("Position of b=");
   System.out.print("[");
   for(k=0;k<b;k++)
   {
    System.out.print(pos2[k]+",");    
   }  
   System.out.println("]");
   
   System.out.println("Position of c=");
   System.out.print("[");
   for(k=0;k<c;k++)
   {
    System.out.print(pos3[k]+",");    
   }  
   System.out.println("]");
   System.out.println("Position of d=");
   System.out.print("[");
   for(k=0;k<d;k++)
   {
    System.out.print(pos4[k]+",");    
   }  
   System.out.println("]");
   
   System.out.println("Position of e=");
   System.out.print("[");
   for(k=0;k<e;k++)
   {
    System.out.print(pos5[k]+",");    
   }  
   System.out.println("]");
   System.out.println("Position of f=");
   System.out.print("[");
   for(k=0;k<f;k++)
   {
    System.out.print(pos6[k]+",");    
   }  
   System.out.println("]");
   
   System.out.println("Position of g=");
   System.out.print("[");
   for(k=0;k<g;k++)
   {
    System.out.print(pos7[k]+",");    
   }  
   System.out.println("]");
   System.out.println("Position of h=");
   System.out.print("[");
   for(k=0;k<h;k++)
   {
    System.out.print(pos8[k]+",");    
   }  
   System.out.println("]");
   
   System.out.println("Position of i=");
   System.out.print("[");
   for(k=0;k<ii;k++)
   {
    System.out.print(pos9[k]+",");    
   }  
   System.out.println("]");
   System.out.println("Position of j=");
   System.out.print("[");
   for(k=0;k<j;k++)
   {
    System.out.print(pos10[k]+",");    
   }  
   System.out.println("]");
   
   System.out.println("Position of k=");
   System.out.print("[");
   for(k=0;k<kk;k++)
   {
    System.out.print(pos11[k]+",");    
   }  
   System.out.println("]");
   System.out.println("Position of l=");
   System.out.print("[");
   for(k=0;k<l;k++)
   {
    System.out.print(pos12[k]+",");    
   }  
   System.out.println("]");
   
   System.out.println("Position of m=");
   System.out.print("[");
   for(k=0;k<m;k++)
   {
    System.out.print(pos13[k]+",");    
   }  
   System.out.println("]");
   System.out.println("Position of n=");
   System.out.print("[");
   for(k=0;k<n;k++)
   {
    System.out.print(pos14[k]+",");    
   }  
   System.out.println("]");
   
   System.out.println("Position of o=");
   System.out.print("[");
   for(k=0;k<o;k++)
   {
    System.out.print(pos15[k]+",");    
   }  
   System.out.println("]");
   System.out.println("Position of p=");
   System.out.print("[");
   for(k=0;k<p;k++)
   {
    System.out.print(pos16[k]+",");    
   }  
   System.out.println("]");
   
   System.out.println("Position of q=");
   System.out.print("[");
   for(k=0;k<q;k++)
   {
    System.out.print(pos17[k]+",");    
   }  
   System.out.println("]");
   System.out.println("Position of r=");
   System.out.print("[");
   for(k=0;k<r;k++)
   {
    System.out.print(pos18[k]+",");    
   }  
   System.out.println("]");
   
   System.out.println("Position of s=");
   System.out.print("[");
   for(k=0;k<ss;k++)
   {
    System.out.print(pos19[k]+",");    
   }  
   System.out.println("]");
   System.out.println("Position of t=");
   System.out.print("[");
   for(k=0;k<t;k++)
   {
    System.out.print(pos20[k]+",");    
   }  
   System.out.println("]");
   
   System.out.println("Position of u=");
   System.out.print("[");
   for(k=0;k<u;k++)
   {
    System.out.print(pos21[k]+",");    
   }  
   System.out.println("]");
   System.out.println("Position of v=");
   System.out.print("[");
   for(k=0;k<v;k++)
   {
    System.out.print(pos22[k]+",");    
   }  
   System.out.println("]");
   
   System.out.println("Position of w=");
   System.out.print("[");
   for(k=0;k<w;k++)
   {
    System.out.print(pos23[k]+",");    
   }  
   System.out.println("]");
   System.out.println("Position of x=");
   System.out.print("[");
   for(k=0;k<x;k++)
   {
    System.out.print(pos24[k]+",");    
   }  
   System.out.println("]");
   
   System.out.println("Position of y=");
   System.out.print("[");
   for(k=0;k<y;k++)
   {
    System.out.print(pos25[k]+",");    
   }  
   System.out.println("]");
   System.out.println("Position of z=");
   System.out.print("[");
   for(k=0;k<z;k++)
   {
    System.out.print(pos26[k]+",");    
   }  
   System.out.println("]");
 }
}
class CharCount
{ 
 public static void main(String []argv)
 {
  Scanner sc=new Scanner(System.in);
  String s=new String();
  System.out.println("Enter a string:");
  s=sc.nextLine();
  new  Occurence(s);
 }
}
