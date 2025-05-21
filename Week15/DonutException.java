/**
 * An Exception that will validate the Donut Object
 *    Donut: topping 1(String), topping 2(String), filling(String), flavor(String)
 * 
 * @author     Baldovi
 * @assignment ICS 111 Assignment 13
 * @date       4/29/23
 * @bugs       none
 */
public class DonutException extends Exception {
  // Instance variable
  private String message = "";

  // Constructor
  public DonutException() {
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
