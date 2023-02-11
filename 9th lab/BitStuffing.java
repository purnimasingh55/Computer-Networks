import java.util.Scanner;

public class BitStuffing {
				public static void main(String[]args) {
					Scanner s=new Scanner(System.in);
					System.out.println("Enter the data from netwrok layer:");
					String str=s.next();
					
					String sub="11111",res="";
					int beg=0,index=0;
					while(index<=str.length()) {
						index=str.indexOf(sub,index);
						if(index!=-1) {
							res=res+str.substring(beg,index+5);
							res=res+"0";
							beg=index+5;
							index=index+5;
							
						}
						else {
							res=res+str.substring(beg, str.length());
							break;
						}
					}
					System.out.println("data after stuffing:"+res);
					
					
					
					
					
					
				}
}
