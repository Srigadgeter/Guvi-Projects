import java.io.*;

public class EvenOdd {

	public static void main(String[] args) throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		
		Integer i = Integer.parseInt(bb.readLine());
		if(i%2 == 0)
			System.out.println(i+" is even");
		else
			System.out.println(i+" is odd");
	}

}
