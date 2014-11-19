import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.*;

/**
 * A class containing the main method that creates Server objects in order to
 * assist multithreading.
 * 
 * @author Aidan O'Grady
 * @version 2.2
 * @since 2.0
 *
 */
public class ServerDriver {

	/**
	 * The main method of this class will start the server side execution
	 * of the program.
	 * 
	 * @param Any arguments added during execution.
	 */
	public static void main(String[] args){
		System.out.println("Hello and welcome to CS313-ACE-2 Server.");
		System.out.println("Author:\tAidan O'Grady");
		System.out.println("Reg No:\t201218150");
		
		try {			
			ServerSocket socket = new ServerSocket(6100);
			System.out.println("Opening server");
			// Creating the thread pool.
			ExecutorService pool = Executors.newCachedThreadPool();
			
			while(true){
				Socket client = socket.accept(); // Connection found.
				System.out.println("Connection found");
				pool.execute(new Server(client)); // Execute thread.
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
