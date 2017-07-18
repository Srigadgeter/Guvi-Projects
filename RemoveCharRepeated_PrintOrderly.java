import java.io.*;

public class RemoveCharRepeated_PrintOrderly {

	public static void main(String[] args)throws IOException {
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		
		String ss = bb.readLine();
		char[] c = ss.toCharArray();
		char cc[] = new char[c.length];
		int i,j,m=0,k=0,flag = 0;
		
		for(i=0;i<c.length;i++){
			flag = 0;
			if(i!=0){
				for(j=0;j<k;j++){
					if(c[i] == cc[j]){
						flag = 1;
						break;
					}
				}
				if(flag == 0){
					cc[m] = c[i];
					m++;
				}
			}			
			else{
				cc[m] = c[i];
				m++;
			}
			k = m;
		}		
		for(i=0;i<k;i++)
			System.out.print(cc[i]);
	}
}
