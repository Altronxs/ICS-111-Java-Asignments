/**
 * An object program that will model a Coffee
 *    Coffee: roast(char), temperture(String), flavor(String)
 * 
 * @author     Baldovi
 * @assignment ICS 111 Assignment 13
 * @date       4/29/23
 * @bugs       none
 */
public class Coffee {
  // Instance variables
  char roast = 'M';
  String temp = "";
  String flavor = "";

  // Constructor
  public Coffee(char roast, String temp, String flavor) throws CoffeeException {
    setRoast(roast);
    setTemp(temp);
    setFlavor(flavor);
  }

  // ToString method
  public String toString() {
    String output = "";

    output += "\nRoast: " + this.roast;
    output += "\nTemperature: " + this.temp;
    output += "\nFlavor" + this.flavor;

    return output;
  }

  // roast(Mutator)
  public void setRoast(char roast) throws CoffeeException{
    if (roast == 'L') {
      // If roast is set as L set Light
      this.roast = roast;
    } else if (roast == 'M') {
      // If rast is set as M set Medium
      this.roast = roast;
    } else if (roast == 'D') {
      // If rast is set as D set Dark
      this.roast = roast;
    } else {
      // If else throw CoffeeException
      CoffeeException ce = new CoffeeException();
      ce.setMessage("Error: " + roast + " is not the following choices - Light(L), Medium(M), Dark(D)");
      throw ce;
    }
  }

  // Temp(Mutator)
  public void setTemp(String temp) throws CoffeeException{
    if (temp.equalsIgnoreCase("hot")) {
      // If set as hot then set hot
      this.temp = temp;
    } else if (temp.equalsIgnoreCase("cold")) {
      // If set cold then set cold
      this.temp = temp;
    } else {
      // If else throw CoffeeException
      CoffeeException ce = new CoffeeException();
      ce.setMessage("Error: " + roast + " is not the following choices - Light(L), Medium(M), Dark(D)");
      throw ce;
    }
  }

  // Flavor(Mutator)
  public void setFlavor(String flavor) throws CoffeeException{
    if (flavor.equalsIgnoreCase("vanilla")) {
      // If vanilla set vanilla
      this.flavor = flavor;
    } else if (flavor.equalsIgnoreCase("hazelnut")) {
      // If hazelnut set hazelnut
      this.flavor = flavor;
    } else {
      // If else throw CoffeeException
      CoffeeException ce = new CoffeeException();
      ce.setMessage("Error: " + roast + " is not the following choices - Light(L), Medium(M), Dark(D)");
      throw ce;
    }
  }
}
