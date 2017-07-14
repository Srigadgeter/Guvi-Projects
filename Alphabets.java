import java.io.*;

public class Alphabets {

	public static void main(String[] args) throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		char cc = (char) bb.read();
		char i,j;
		Integer flag = 0;
		
		for(i=65,j=97;i<=90 && j<=122;i++,j++){
			if(cc == i || cc == j)
				flag = 1;
		}
		if(flag == 1)
			System.out.println(cc + " is alphabet");
		else
			System.out.println(cc + " is not alphabet");
		
	}

}
