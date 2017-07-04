import java.io.*;

public class MaxOfThree {

	public static void main(String[] args) throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter three numbers to find maximum of them");
		Integer a,b,c;
		
		a = Integer.parseInt(bb.readLine());
		b = Integer.parseInt(bb.readLine());
		c = Integer.parseInt(bb.readLine());
		
		System.out.println("Maximum of three number is "+Math.max(Math.max(a,b),c));
		
	}
}

