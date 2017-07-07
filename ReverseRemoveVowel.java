import java.io.*;

public class ReverseRemoveVowel {

	public static void main(String[] args) throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		
		int i;
		System.out.print("Enter the string : ");
		String s = bb.readLine();
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println("Reversed string is "+sb);
		
		s = String.valueOf(sb);
		System.out.print("Removed vowels from reversed string is ");
		for(i=0;i<s.length();i++){
			if(s.charAt(i) != 'a'
					&& s.charAt(i) != 'e'
					&& s.charAt(i) != 'i'
					&& s.charAt(i) != 'o'
					&& s.charAt(i) != 'u')
				System.out.print(s.charAt(i));
		}
	}
}
