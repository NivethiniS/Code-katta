import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 class Main{
public static void main(String[] args) {
	
	try{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
	int n1=Integer.parseInt(br.readLine());
	int n2=Integer.parseInt(br.readLine());
	
	int n=n1+n2;
	
	double a=Math.sqrt(n);
	double b=Math.round(a);
	
	if(a==b)
		System.out.println("perfect square");
	else
		System.out.println("not perfect square");
	}
 
	catch(IOException e){
		System.out.println("error in input");
		}
 
	}
}
