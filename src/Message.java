/**
 * A message which stores a string along with the number of characters and 
 * digits that appear within that string. This is done to meet the specification
 * of the exercise being undertaken.
 * 
 * @author Aidan O'Grady
 * @version 1.1
 * @since 0.1
 *
 */
public interface Message {
	
	/**
	 * Sets the message field to the string that is passed to the method.
	 * 
	 * @param The message that is to be stored within the class.
	 */
	public void setMessage(String message); // Sets the message.
	
	/**
	 * Sets the number of characters and number of digits that appear in the
	 * message. This is done in the one method since obtaining the number of
	 * characters is extremely simple, and thus can be done before setting the
	 * number of digits.
	 */
	public void setCounts(); // Sets the counts for characters and digits.
	
	/**
	 * Gets the message that is stored within the class, and returns it.
	 * 
	 * @return the message in its string format.
	 */
	public String getMessage(); // Returns the message.
	
	/**
	 * Gets the character count field and returns to the caller.
	 * 
	 * @return the character count.
	 */
	public int getCharacterCount(); // Returns the number of characters.
	
	/**
	 * Gets the digit count field and returns to the caller.
	 * 
	 * @return the number of digits appearing within the string.
	 */
	public int getDigitCount(); // Returns the number of digits.

}
