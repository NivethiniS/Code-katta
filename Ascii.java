public class CheckChValue
{ 

public static void main(String[] args) 
{ 

    String name = "admin";
    int nameLenght = name.length(); 

    for(int i = 0; i < nameLenght ; i++){          
        char character = name.charAt(i); 
        int ascii = (int) character;
        System.out.println(character+" = "+ ascii); 
    }
}
