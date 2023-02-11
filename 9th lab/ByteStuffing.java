import java.util.Scanner;
public class ByteStuffing {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the message: ");
			String str=sc.next();
			
			int index=0,beg=0;
			String s="",res="";
			
			while(index<=str.length()) {
				index=str.indexOf("E", index);
				if(index!=-1) {
					s=s+str.substring(beg, index);
					s=s+"EE";
					beg=index+1;
					index=index+1;
				}
				else{
					s=s+str.substring(beg,str.length());
					break;
				}
			}
			
			beg=0;
			index=0;
			while(index<=s.length()) {
				index=s.indexOf("F", index);
				if(index!=-1) {
					res=res+s.substring(beg, index);
					res=res+"EF";
					beg=index+1;
					index=index+1;
				}
				else{
					res=res+s.substring(beg,s.length());
					break;
				}
			}
			
			System.out.println(res);
		}

	}