import java.io.*;

public class PosNeg {

	public static void main(String[] args) throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		Integer i = Integer.parseInt(bb.readLine());
		if(i>0)
			System.out.println(i+" is positive");
		else if(i==0)
			System.out.println(i+" is zero");
		else
			System.out.println(i+" is negative");
	}

}
