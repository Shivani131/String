import java.util.*;  
  
public class Substring 
{    
    public static void main(String args[])  
    {    
        String text= new String("Hello, My name is Shivani");  
        String[] sentences = text.split("\\.");  
        System.out.println(Arrays.toString(sentences));  
    }  
}    