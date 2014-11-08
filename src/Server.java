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
	
	/** Socket listens for incoming connections. */
	private ServerSocket socket;
	
	/** Used for reading the client input stream. */
	private BufferedReader br;
	
	/** Used to read data from client. */
	private InputStreamReader isr;
	
	/** Sending a Message object back to client. */
	private ObjectOutputStream output;
	
	/** 
	 * Constructor method, initialises a Server object. 
	 */
	public Server(){
		socket = null;
		br = null;
		isr = null;
		output = null;
	}
	
	/**
	 * Runs the server, allowing it to carry out its execution. The server will
	 * listen for connections, and will then send back Messages based on input
	 * received from a client.
	 */
	private void run() {
		try{
			socket = new ServerSocket(6100);
			
			while(true){
				Socket client = socket.accept(); // Connection found.
				
				// Obtaining the string from client.
				isr = new InputStreamReader(client.getInputStream());
				br = new BufferedReader(isr);
				String line = br.readLine();
				
				// Creating and sending a Message object.
				Message message = new MessageImpl(line);
				output = new ObjectOutputStream(client.getOutputStream());
				output.writeObject(message);
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
		server.run();
	}

}
