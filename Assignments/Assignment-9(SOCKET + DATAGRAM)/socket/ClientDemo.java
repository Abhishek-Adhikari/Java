import java.net.Socket;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;

class ClientDemo {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("localhost", 3333);
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		
		DataInputStream dis = new DataInputStream(s.getInputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str="",str2="";  
		while(!str.equals("stop")){  
			str=br.readLine();  
			dos.writeUTF(str);  
			dos.flush();  
			str2=dis.readUTF();  
			System.out.println("Server says: " + str2);  
		}

		dos.flush();
		dos.close();
		s.close();
	}	
}