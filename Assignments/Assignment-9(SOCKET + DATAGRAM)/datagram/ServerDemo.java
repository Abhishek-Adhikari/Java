import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Scanner;
import java.net.SocketException;
import java.net.UnknownHostException;

class ServerDemo {
	public static void main(String[] args) throws IOException, SocketException, UnknownHostException{
		DatagramSocket ds = new DatagramSocket(3000);

		InetAddress ia = InetAddress.getLocalHost();


		while(true) {
			byte[] barr = new byte[1024];

			DatagramPacket dp = new DatagramPacket(barr, barr.length);

			ds.receive(dp);

			System.out.println("Client says: " + new String(dp.getData(),0,dp.getLength()));


			String message = new Scanner(System.in).nextLine();
			ds.send(new DatagramPacket(message.getBytes(),message.length(), ia, 9999));
		}	
		// ds.close(); // unreachable statement
	}
}