import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.io.IOException;
import java.util.Scanner;
import java.net.SocketException;
import java.net.UnknownHostException;


class ClientDemo {
	public static void main(String[] args) throws IOException, SocketException, UnknownHostException {
		
		DatagramSocket ds = new DatagramSocket(9999);
		
		InetAddress ia = InetAddress.getLocalHost();

		while(true) {
			byte[] barr = new byte[1024];
			DatagramPacket dp = new DatagramPacket(barr, barr.length);
			String message = new Scanner(System.in).nextLine();
			barr = message.getBytes();
			ds.send(new DatagramPacket(barr,barr.length, ia, 3000));
			ds.receive(dp);
			System.out.println("Server says: " + new String(dp.getData(),0,dp.getLength()));
		}	

		ds.close(); // unreachable statement

	}
}