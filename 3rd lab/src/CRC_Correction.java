import java.io.*;

public class CRC_Correction {
	public static void main(String args[]) throws IOException
	 {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Enter Generator:");
	  String gen = br.readLine();
	  
	  System.out.println("Enter msg:");
	  String msg = br.readLine();
	  
	  String code = msg;
	  while(code.length() < (msg.length() + gen.length() - 1))
	   code = code + "0";
	  code = msg + div(code,gen);
	  System.out.println("The transmitted Code Word is: " + code);
	  System.out.println("Please enter the received Code Word: ");
	  String rec = br.readLine();
	  
	  if(Integer.parseInt(div(rec,gen)) == 0)
	   System.out.println("The received code word contains no errors.");
	  else
	   System.out.println("The received code word contains errors.");
	 }
	 
	 public static String div(String num1,String num2)
	 {
	  int p = num2.length();
	  String result = num1.substring(0, p);
	  String remainder = "";
	  for(int i = 0; i < num2.length(); i++)
	  {
	   if(result.charAt(i) == num2.charAt(i))
	    remainder += "0";
	   else
	    remainder += "1";
	  }
	  while(p < num1.length())
	  {
	   if(remainder.charAt(0) == '0')
	   {
	    remainder = remainder.substring(1, remainder.length());
	    remainder = remainder + String.valueOf(num1.charAt(p));
	    p++;
	   }
	   result = remainder;
	   remainder = "";
	   for(int i = 0; i < num2.length(); i++)
	   {
	    if(result.charAt(i) == num2.charAt(i))
	     remainder += "0";
	    else
	     remainder += "1";
	   }
	  }
	  return remainder.substring(1,remainder.length());
	 }
	}