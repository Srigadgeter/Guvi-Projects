import java.io.*;

public class UniqueElements {

	public static void main(String[] args)throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));

		char i;
		int j,k,max;
		Integer[] ii = new Integer[256];
		String s = bb.readLine();
		
		for(j=0;j<256;j++)
			ii[j] = 0;
		
		for(k=0;k<s.length();k++){
			for(i=0,j=0;i<256 && j<256;i++,j++){
				if(s.charAt(k) == i)
					ii[j]++;
			}
		}
		
		for(i=0,j=0;i<256 && j<256;i++,j++){
			if(ii[j] != 0)
				System.out.println("'"+i+"' "+ii[j]);			
		}
		
		System.out.println("Unique elements are");
		for(i=0,j=0;i<256 && j<256;i++,j++){
			if(ii[j] == 1)
				System.out.println("'"+i+"'");			
		}
		
	}
}
