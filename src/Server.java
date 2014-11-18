import java.net.*;
import java.io.*;

/**
 * The server class is responsible for taking a string input from a client and
 * creating an object of the Message class with it. It will then send the object
 * back to the client after setting the counts.
 * 
 * @author Aidan O'Grady
 * @version 1.3
 * @since 1.1
 *
 */
public class Server {
			
	/** Message to be sent from server to client. */
	private Message message;
	
	/** The input of the client used to create the message. */
	private String line;
	
	/** 
	 * Constructor method, initialises a Server object. 
	 */
	public Server(){
		message = null;
		line = "";
		run();
	}
	
	/**
	 * Runs the server, allowing it to carry out its execution. The server will
	 * listen for connections, and will then send back Messages based on input
	 * received from a client.
	 */
	private void run() {
		System.out.println("Opening server");
		try{
			ServerSocket socket = new ServerSocket(6100);
			
			while(true){
				Socket client = socket.accept(); // Connection found.
				System.out.println("Connection found");

				// Obtaining the string from client.
				InputStreamReader isr;
				isr = new InputStreamReader(client.getInputStream());
				BufferedReader br = new BufferedReader(isr);
				line = br.readLine();
				System.out.println("String input read");


				// Creating and sending a Message object.
				message = new MessageImpl(line);
				ObjectOutputStream output;
				output = new ObjectOutputStream(client.getOutputStream());
				output.writeObject(message);
				System.out.println("Message sent");

			}
			
		} catch (IOException ioe){
			System.err.println(ioe);
		}
		
	}
	
	/**
	 * The main method of this class will start the server side execution
	 * of the program.
	 * 
	 * @param Any arguments added during execution.
	 */
	public static void main(String[] args){
		Server server = new Server();
	}

}
