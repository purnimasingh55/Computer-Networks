import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client{
    public static void main(String[] args){
        DataInputStream  input   = null;
        DataOutputStream out     = null;
        try{
            Socket s = new  Socket("localhost",6666);
            Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
            System.out.print("Enter Client msg: ");  
            
            input  = new DataInputStream(System.in);
            String str= sc.nextLine(); 
 
            // sends output to the socket
            out    = new DataOutputStream(s.getOutputStream());
            out.flush();
            out.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}