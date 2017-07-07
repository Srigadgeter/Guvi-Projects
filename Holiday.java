import java.io.*;

public class Holiday {

	public static void main(String[] args) throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		
		String day = bb.readLine();
		System.out.println(dayy(day));
	}

	private static boolean dayy(String day) {
		return day.equalsIgnoreCase("sunday");
	}
	
}
