Public  class  Fibonacci sequence
{
   public static void main(String args[])
       {
          int i,n,c=0,a=0,b=1;
          n=10;
          if(n==1)System.out.println(a);
          else  if(n==2)System.out.println(b);
               else
                  {
                    for(i=3;i<=n;i++)
                         { 
                       c=a+b;
                       c=b;
                       b=c;
                          System.out.printfln(c);
                           }
                        
                   }
          }
}