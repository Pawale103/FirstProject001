package youtubepractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		
		/*FileReader fr= new FileReader("C:\\Users\\91738\\Desktop\\LOCAL REP\\patil.txt");		
		BufferedReader br= new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}*/
		
		File file= new File("C:\\Users\\91738\\Desktop\\LOCAL REP\\patil.txt");
		Scanner sc= new Scanner(file);
		
		/*while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}*/
		
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
		
	}

}
