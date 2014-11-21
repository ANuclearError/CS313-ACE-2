import java.net.*;
import java.io.*;

/**
 * The server class is responsible for taking a string input from a client and
 * creating an object of the Message class with it. It will then send the object
 * back to the client after setting the counts.
 * 
 * @author Aidan O'Grady
 * @version 2.2
 * @since 1.1
 *
 */
public class Server implements Runnable{
			
	/** Message to be sent from server to client. */
	private Message message;
	
	/** The input of the client used to create the message. */
	private String line;
	
	/** The client the message is to be sent to. */
	private Socket client;
	
	/** 
	 * Constructor method, initialises a Server object. 
	 */
	public Server(Socket socket){
		message = null;
		line = "";
		client = socket;
	}
	
	/**
	 * Runs the server, allowing it to carry out its execution. The server will
	 * listen for connections, and will then send back Messages based on input
	 * received from a client.
	 */
	public void run() {
		try {
			// To me
			// Obtaining the string from client.
			InputStreamReader isr;
			isr = new InputStreamReader(client.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			line = br.readLine();
			System.out.println("String input read");
			
			// To you
			// Creating and sending a Message object.
			message = new MessageImpl(line);
			ObjectOutputStream output;
			output = new ObjectOutputStream(client.getOutputStream());
			output.writeObject(message);
			System.out.println("Message sent");
		} catch (IOException err) {
			System.err.println(err);
		}
	}
}
