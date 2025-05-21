/**
 * An Exception that will validate the Coffee Object
 *    Coffee: roast(char), temperture(String), flavor(String)
 * 
 * @author     Baldovi
 * @assignment ICS 111 Assignment 13
 * @date       4/29/23
 * @bugs       none
 */
public class CoffeeException extends Exception {
    // Instance variable
  private String message = "";

  // Constructor
  public CoffeeException() {
  }

  // Mutator
  public void setMessage(String newMessage) {
    this.message = newMessage;
  }

  // Accessor
  public String getMessage() {
    return this.message;
  }
}
