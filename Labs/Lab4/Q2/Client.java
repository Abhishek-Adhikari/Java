import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 3030);
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.writeUTF("Hey");
		dos.flush();
		socket.close();
	}
}