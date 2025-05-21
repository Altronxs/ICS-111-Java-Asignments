/**
 * An object program that will model a Donut
 *    Donut: topping 1(String), topping 2(String), filling(String), flavor(String)
 * 
 * @author     Baldovi
 * @assignment ICS 111 Assignment 13
 * @date       4/29/23
 * @bugs       none
 */

public class Donut {
  // Instance Variables
  String topping = "";
  String filling = "";
  String flavor = "";
  
  // Constructor
  public Donut(String topping, String filling, String flavor) throws DonutException {
    setTopping(topping);
    setFilling(filling);
    setFlavor(flavor);
  }

  // ToString method
  public String toString() {
    String output = "";

    output += "\nTopping: " + this.topping;
    output += "\nFilling: " + this.filling;
    output += "\nFlavor" + this.flavor;

    return output;
  }

  // Topping(Mutator)
  public void setTopping(String topping) throws DonutException {
    if (topping.equalsIgnoreCase("none")) {
      // If topping equals none then set none
      this.topping = topping;
    } else if (topping.equalsIgnoreCase("glaze")) {
      // If topping equals glaze then set glaze
      this.topping = topping;
    } else if (topping.equalsIgnoreCase("powdered-sugar")) {
      // If topping equals powdered-sugar then set powdered-sugar
      this.topping = topping;
    } else if (topping.equalsIgnoreCase("strawberry")) {
      // If topping equals strawberry then set strawberry
      this.topping = topping;
    } else if (topping.equalsIgnoreCase("vanilla")) {
      // If topping equals vanilla then set vanilla
      this.topping = topping;
    } else if (topping.equalsIgnoreCase("chocolate")) {
      // If topping equals glaze then set glaze
      this.topping = topping;
    } else {
      // If else throw DonutException
      DonutException de = new DonutException();
      de.setMessage("Error: " + topping + " is not the following topping choices - none, glaze, powdered-sugar, strawberry, vanilla, chocolate");
      throw de;
    }
  }

  // Filling(Mutator)
  public void setFilling(String filling) throws DonutException {
    if (filling.equalsIgnoreCase("none")) {
      // If filling is none then set none
      this.filling = filling;
    } else if (filling.equalsIgnoreCase("custard")) {
      // If filling equals custard then set custard
      this.filling = filling;
    } else if (filling.equalsIgnoreCase("chocolate")) {
      // If filling equals chocolate then set chocolate
      this.filling = filling;
    } else if (filling.equalsIgnoreCase("cherry")) {
      // If filling equals cherry then set cherry
      this.filling = filling;
    } else {
      // If else throw DonutException
      DonutException de = new DonutException();
      de.setMessage("Error: " + filling + " is not the following filling choices - none, custard, chocolate, strawberrgy");
      throw de;
    }
  }

  // Flavor(Mutator)
  public void setFlavor(String flavor) throws DonutException {
    if (flavor.equalsIgnoreCase("vanilla")) {
      // If set vanilla then set vanilla
      this.flavor = flavor;
    } else if (flavor.equalsIgnoreCase("chocolate")) {
      // If set chocolate then set chocolate
      this.flavor = flavor;
    } else {
      // If else throw DonutException
      DonutException de = new DonutException();
      de.setMessage("Error: " + flavor + " is not the following flavor choices - vanilla, chocolate");
      throw de;
    }
  }

}
