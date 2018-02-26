ArithmeticProgress.java
{
public static void main(String arg[])
{
    int n,a,d,sum=0,i;
    System.out.println("enter the values");
  System.out.println(n+a+d);
    for(i=n;i>0;i--)
    {
    sum=sum+(a+(n-1)*d);
    }
    sum=sum+a;
   System.out.println(sum);
}
}
