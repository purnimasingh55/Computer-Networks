import java.net.*;
import java.io.*;
class Client
{
    public static void main(String []args)throws Exception
    {
        Socket s=new Socket(InetAddress.getLocalHost(),10);
        DataInputStream in=new DataInputStream(s.getInputStream());
        BufferedReader d=new BufferedReader(new InputStreamReader(in));
        PrintStream p=new PrintStream(s.getOutputStream());
        int i=0,rptr=-1,nf,rws=8;
        String rbuf[]=new String[8];
        String ch; 
        System.out.println();
        do{
            nf=Integer.parseInt(d.readLine());
            if(nf<=rws-1){
                for(i=1;i<=nf;i++)
                {
                    rptr=++rptr%8;
                    rbuf[rptr]=d.readLine();
                    System.out.println("The received Frame " +rptr+" is : "+rbuf[rptr]);
                }
                rws-=nf;
                System.out.println("\nAcknowledgment sent\n");
                p.println(rptr+1); rws+=nf; }
                else
                break;
                ch=d.readLine();
            }
            while(ch.equals("yes"));
        }
}