import java.util.Scanner;

/**
 * A class containing the main method that creates Server objects in order to
 * assist multithreading.
 * 
 * @author Aidan O'Grady
 * @version 2.0
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
		Scanner scanner = new Scanner(System.in);
		Server server = new Server();
	}

}
