import java.util.Scanner;
public class StringGetBytesExample{  
public static void main(String args[]){  
    Scanner scan=new Scanner(System.in);
String s1=scan.nextLine();
System.out.println(s1);
byte[] barr=s1.getBytes();  
for(int i=0;i<barr.length;i++){  
System.out.println(barr[i]);  
}  
}}  
