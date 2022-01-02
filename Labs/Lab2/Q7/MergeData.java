import java.io.*;

class MergeData {
	public static void main(String[] args) throws IOException{
		File dir = new File("C:\\Users\\abhis.LAPTOP-ABHI\\Desktop");

		PrintWriter pw = new PrintWriter("output.txt");

		String[] fileNames = dir.list();	

		for (String fileName : fileNames) {
			System.out.println(fileName);

			File f = new File(dir, fileName);
			
			 BufferedReader br = new BufferedReader(new FileReader(f));
            pw.println("file name: " + fileName);


             String line = br.readLine();
            while (line != null) {
 
                // write to the output file
                pw.println(line);
                line = br.readLine();
            }
            pw.flush();
		}
	}
}




