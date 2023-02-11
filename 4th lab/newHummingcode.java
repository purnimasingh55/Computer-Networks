import java.io.IOException;
import java.util.Scanner;

public class newHammingcode {
	
public static void main(String[]args) throws IOException{
				Scanner s=new Scanner(System.in);
				System.out.println("enter m value:");
				int m=s.nextInt();
				s.nextLine();
				String str=s.nextLine();
				int  r=find_r(m);
				int[] arr = generateCode(str, m, r);
				System.out.println("Generated parity bits are: ");
		       int ar[] =calculation(arr, r);
		       System.out.println("Generated complete message is: ");
		        printMsg(ar);
}
public static void printMsg(int[]ar) {
	for(int i=1;i<ar.length;i++)
		System.out.print(ar[i]);
	System.out.println();
}

public static int find_r(int m) {
	double r=1;
	while(true) {
	if((m+r+1)<=Math.pow(2, r)) {
		break;
	}
		else 
		r++;
}
	
	return (int)r;
}

public  static int[] calculation(int[] ar, int r)
{
    for (int i = 0; i < r; i++) {
        int x = (int)Math.pow(2, i);
        for (int j = 1; j < ar.length; j++) {
            if (((j >> i) & 1) == 1) {
                if (x != j)
                    ar[x] = ar[x] ^ ar[j];
            }
        }
        System.out.println("r" + x + " = "+ ar[x]);
    }
   return ar;
}

public static int[] generateCode(String str, int m, int r)
{
int[] ar = new int[r + m+ 1];
int j = 0;
for (int i = 1; i < ar.length; i++) {
    if ((Math.ceil(Math.log(i) / Math.log(2))
         - Math.floor(Math.log(i) / Math.log(2)))
        == 0)
    {
        ar[i] = 0;
    }
    else {

        ar[i] = (int)(str.charAt(j) - '0');
        j++;
    }
}
return ar;
}
	
}