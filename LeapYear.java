import java.io.*;

public class LeapYear {

	public static void main(String[] args) throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the year (yyyy)");
		Integer p = Integer.parseInt(bb.readLine());
		
		System.out.println(p%4 == 0 || p%100 == 0  || p%400 == 0);
		
	}

}
