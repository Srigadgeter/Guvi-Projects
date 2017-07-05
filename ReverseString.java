import java.io.*;
public class ReverseString {

	public static void main(String[] args) throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		String ss,s = bb.readLine();
		ss = "";
		int i;
		if(s.length()%2 == 0){
			for(i=0;i<s.length()-1;i+=2){
				ss += s.charAt(i+1);
				ss += s.charAt(i);
			}
		}
		else{
			for(i=0;i<s.length()-2;i+=2){
				ss += s.charAt(i+1);
				ss += s.charAt(i);
			}
			ss += s.charAt(i);
		}
		
		System.out.println(ss);
		
	}

}
