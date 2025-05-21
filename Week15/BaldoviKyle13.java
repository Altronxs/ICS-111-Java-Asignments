/**
 * Create a program that will model a music playlist.
 * In that playlist there will be Song objects that will be holding certain parameters.
 * Finally print out the playlist using a method.
 * 
 * @author     Baldovi
 * @assignment ICS 111 Assignment 13
 * @date       4/29/23
 * @bugs       none
 */

public class BaldoviKyle13 {
  public static void main(String[] args) {
    System.out.println("Hello");
    char test = 'l';
    System.out.println(test == 'L');
    try {
      Donut donut1 = new Donut("Glaze", "none", "vanilla"); 
      donut1.setTopping("chocolate");
      Coffee coffee1 = new Coffee('D', "cold", "hazelnut");
      coffee1.setFlavor("invalid");
    } catch (DonutException de) {
      System.out.println(de.getMessage());
    } catch (CoffeeException ce) {
      System.out.println(ce.getMessage());
    }

    System.out.println("helloTWO");
  }
}
