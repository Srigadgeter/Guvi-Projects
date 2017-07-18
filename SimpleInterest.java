import java.io.*;

public class SimpleInterest {

	public static void main(String[] args)throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		
		Float p,r;
		Integer n;
		
		System.out.println("Enter the principal amount \n"
				+ "number of years \nrate of interest (resp.)");
		p = Float.parseFloat(bb.readLine());
		n = Integer.parseInt(bb.readLine());
		r = Float.parseFloat(bb.readLine());
		System.out.println("Simple interest amount is : "+(float)((p*n*r)/100.0));
	}
}
