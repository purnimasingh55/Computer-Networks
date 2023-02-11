import java.net.*;
import java.io.*;
import java.rmi.*;
public class Server {
		@SuppressWarnings("deprecation")
		public static void main(String[] args)throws IOException
		{
		ServerSocket ser=new ServerSocket(10);
		Socket s=ser.accept();
		DataInputStream in=new DataInputStream(System.in);
		DataInputStream in1=new DataInputStream(s.getInputStream());
		//BufferedReader d =new BufferedReader(d);
		BufferedReader d=new BufferedReader(new InputStreamReader(in));
		//PrintStream p=new PrintStream(s.getOutputStream());
		String sbuff[]=new String[8];
		PrintStream p;
		int sptr=0,sws=8,nf,ano,i;
		String ch;
		
		do
		{
		p=new PrintStream(s.getOutputStream());
		System.out.print("Enter the no. of frames : ");
		nf=Integer.parseInt(d.readLine());
		p.println(nf);
		if(nf<=sws-1)
		{

		System.out.println("Enter "+nf+" Messages to be send\n");
		for(i=1;i<=nf;i++)
		{
		sbuff[sptr]=d.readLine();
		
		p.println(sbuff[sptr]);
		sptr=++sptr%8;
		}
		sws-=nf;
		System.out.print("Acknowledgment received");
		ano=Integer.parseInt(d.readLine());
		System.out.println(" for "+ano+" frames");
		sws+=nf;
		}
		else
		{
		System.out.println("The no. of frames exceeds window size");
		break;
		}
		System.out.print("\nDo you wants to send some more frames : ");
		ch=d.readLine();
		p.println(ch);
		}
		while(ch.equals("yes"));
		s.close();
		}
}