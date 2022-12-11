package youtubepractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInTextfile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fr= new FileWriter("C:\\Users\\91738\\Desktop\\LOCAL REP\\writer.txt");
	BufferedWriter br= new BufferedWriter(fr);
	br.write("this is buffredwriter to write in text files");
	br.write("911");
	br.write("this is not done");
	System.out.println("progam is completed");
	br.close();
		
		
	}
}
