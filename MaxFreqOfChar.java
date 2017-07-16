import java.io.*;

public class MaxFreqOfChar {

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
		
		max = ii[0];
		for(j=1;j<256;j++){
			if(max < ii[j])
				max = ii[j];
		}
		
		System.out.println("Maximum repeated elements are :");		
		for(i=0,j=0;i<256 && j<256;i++,j++){
			if(ii[j] == max)
				System.out.println("'"+i+"'");			
		}
	}
}
