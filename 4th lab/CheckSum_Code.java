import java.util.*;
public class CheckSum_Code {
    public static String computeCheckSum(String msg,int k) {
        boolean flag=true;
        int r=msg.length()%k;
        if(r!=0) {
            while(r>0) {
                msg='0'+msg;
                r--;
            }
        }
        int n=msg.length()/k;
        String[] s=new String[k];
        int x=0;
        int j=0;
        while(j!=(k)) {
            s[j]="";
            for(int i=0;i<n;i++) {
                s[j]+=msg.charAt(x);
                x++;
            }
            j++;
        }
        for(int i=0;i<k;i++)
        System.out.println(s[i]+" ");
        String carry="",str="";
        int sum=0;
        for(j=0;j<k;j++) {
            sum+=Integer.parseInt(s[j], 2);
            }
            String sum_binary=Integer.toBinaryString(sum);
            while(flag) {
                int len=sum_binary.length();
                if(len<n) {
                    for(int i=0;i<(n-len);i++) sum_binary='0'+sum_binary;
                }
                else if(len>n){
                    for(int i=0;i<len;i++) {
                        if(i<(len-n)) 
                            carry+=sum_binary.charAt(i);
                        else 
                            str+=sum_binary.charAt(i);
                    }
                sum=0;
                sum+=Integer.parseInt(str, 2);
                sum+=Integer.parseInt(carry, 2); sum_binary=Integer.toBinaryString(sum);
        }
            else
            flag=false;
    }
    str="";
    for(int i=0;i<n;i++) {
        if(sum_binary.charAt(i)=='1')
            str+='0';
        else
            str+='1';
    }
    return str;

    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the message: ");
    String msg=sc.nextLine();
    System.out.println("Enter a number of blocks (k value): ");
    int k=sc.nextInt();
    System.out.println("Checksum for message : "+computeCheckSum(msg,k));
    sc.close();
}
}