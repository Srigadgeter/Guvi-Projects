import java.io.*;

public class ReverseString {

	public static void main(String[] args) throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bb.readLine();
		StringBuffer ss = new StringBuffer(s);
		ss.reverse();
		System.out.println("Reversed string of \""+s+"\" is \""+ss+"\"");
	}

}
