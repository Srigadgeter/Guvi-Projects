import java.io.*;

public class VowelCons {

	public static void main(String[] args) throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		
		char c[] = {'a','e','i','o','u'};
		char cc = (char) bb.read();
		
		for(int i=0;i<c.length;i++){
			if(c[i] == cc)
				System.out.println(cc + " is vowel");
			else
				System.out.println(cc + " is consonants");
		}
	}

}

