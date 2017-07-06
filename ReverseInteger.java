import java.io.*;

public class ReverseInteger {

	public static void main(String[] args) throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		
		String s = String.valueOf(Integer.parseInt(bb.readLine()));
		StringBuffer ss = new StringBuffer(s);
		ss.reverse();
		System.out.println("Reversed string of \""+s+"\" is \""+ss+"\"");
	}

}
