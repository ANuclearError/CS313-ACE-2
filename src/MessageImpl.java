import java.io.Serializable;

/**
 * An implementation of the message interface. This class is used to store the
 * message that will be sent from client to server, as well as storing the
 * counts for the number of digits and characters in that string. It will also
 * implement the Serializable interface as well to allow the transfer between
 * the client and server.
 * 
 * @author Aidan O'Grady
 * @version 0.3
 * @since 0.2
 *
 */
public class MessageImpl implements Message, Serializable{
	
	/**
	 * Generated for serializable implementation purposes.
	 */
	private static final long serialVersionUID = -253196530177622058L;
	
	/**
	 * The string that represents the message being sent from the client.
	 */
	private String message;
	
	/**
	 * The number of characters that are within message.
	 */
	private int characterCount;
	
	/**
	 * The number of digits that are within message.
	 */
	private int digitCount;
	
	/**
	 * The constructor of the MessageImpl class. It will initially set the
	 * fields to temporary values before calling the setters that will create
	 * the object. 
	 * 
	 * @param string
	 */
	public MessageImpl(String string){
		// Dummy values for when the fields are initialized.
		message = null;
		characterCount = 0;
		digitCount = 0;
		
		// Calling the setter methods to actually fill in the above fields.
		setMessage(string);
		setCounts();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void setCounts() {
		characterCount = message.length(); // Character count set based, easy!
		
		/*
		 * The for loop iterates through the string and increments digitCount
		 * whenever it encounters a digit character, being between '0' and '9'
		 * inclusively.
		 */
		for(char character : message.toCharArray()){
			if(Character.isDigit(character))
				digitCount++;
		}
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public int getCharacterCount() {
		return characterCount;
	}

	@Override
	public int getDigitCount() {
		return digitCount;
	}

}
