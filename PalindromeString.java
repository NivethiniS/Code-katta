import java.util.Scanner;
class Main
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
  System.out.println(str);
  
  String str2="";
  char[] ch=str.toCharArray();
  for(int i=ch.length-1;i>=0;i--)
  {
    str2=str2+ch[i];
  }

  if(str.equals(str2))
  {
      System.out.println("Yes");  
  }
  else{
        System.out.println("No");
  }
}
}
