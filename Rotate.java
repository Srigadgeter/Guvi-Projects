import java.io.*;

public class Rotate {
	public static void main(String[] args)throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		
		int i,j,m;
		System.out.println("Enter the size of an array:");
		Integer n = Integer.parseInt(bb.readLine());
		System.out.println("Enter the number of rotation:");
		Integer r = Integer.parseInt(bb.readLine());
		System.out.println("Enter the elements:");
		Integer[] ar = new Integer[n];
		Integer[] arr = new Integer[n];
		
		for(i=0;i<n;i++)
			ar[i] = Integer.parseInt(bb.readLine());
		
		for(i=0;i<r;i++){
			j=n-i-1;
			m=0;
			while(m<=n){
				if(j<n){
//					System.out.print(ar[j]);
					if(m<n)
						arr[m] = ar[j];
					else
						arr[m-1] = ar[j];
					j++;
				}
				else
					j=0;
				m++;
			}
//			System.out.println();
		}
		
		for(i=0;i<n;i++)
			System.out.print(arr[i]);
	}
}
