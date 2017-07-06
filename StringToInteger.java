import java.io.*;


public class StringToInteger {
	
	public static void main(String[] args) throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bb.readLine();
		//string to integer conversion
		
		System.out.println("Given string is "+s+" converted to integer is "+Integer.parseInt(s));
	}

}
