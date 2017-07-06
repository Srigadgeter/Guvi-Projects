import java.io.*;

public class Fact {
	public static void main(String[] args)throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		
		Integer i,f = 1, n = Integer.parseInt(bb.readLine());
		for(i=1;i<=n;i++)
			f *= i;
		
		System.out.println(f);
		
	}
}
