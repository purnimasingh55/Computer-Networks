import java.io.*;
import java.util.Scanner;

public class VRC {
	public static void main(String args[]) throws IOException
	 {
	  Scanner br = new Scanner(System.in);
	  System.out.println("Enter Msg: ");
	  int n = br.nextInt();
	  int msg = n;
	  int count =0;
	  while(n!=0){
	      if(n%10==1){
	          count++;
	          
	      }
	          n=n/10;
	  }
	  if(count%2!=0){
	      System.out.println("Error exis");
	      System.out.println("Msg to be sent is: "+ msg +"1");
	  }
	  else{
	      System.out.println("No error exist");
	      System.out.println("Msg to be sent is: "+ msg +"0");
	  }
	}
}