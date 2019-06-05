package listening_post;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Listener {

	public static void main(String[] args) {
		byte buffer[] = new byte[1024]; 
		try {
			@SuppressWarnings("resource")
			DatagramSocket sock = new DatagramSocket(9000, InetAddress.getByName("csgrads1.utdallas.edu"));
			DatagramPacket p = new DatagramPacket(buffer, 1024);
			while(true) {
				sock.receive(p);
				System.out.println(new String(p.getData()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
