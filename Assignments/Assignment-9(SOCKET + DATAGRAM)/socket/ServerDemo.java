import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.DataInputStream;


import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;


class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(3333);
		Socket s = ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String str="",str2="";  
		while(!str.equals("stop")){  
			str=br.readLine();  
			dos.writeUTF(str);  
			dos.flush();  
			str2=dis.readUTF();  
			System.out.println("client says: " + str2);  
		}

		// String txt = (String)dis.readUTF();
		// System.out.println("client says:" + txt);
		dis.close();
		s.close();
		ss.close(); 
	}	
}