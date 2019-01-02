// Brea Zeller
// February 7, 2018
// CPW 142 Winter 2018
// Programming Assignment #5
// The Programming assignment will prompt for the inputs from the user 
// then the information about their luggage will be calculated to see if the user needs to pay extra fee for the luggage they have. 

import java.util.*;

public class LuggageFeeCalculator {

 public static final double WEIGHT_ALLOWANCE = 50.0;
 public static final double SIZE_ALLOWANCE = 62.0;

 public static void main(String[] args) {
  Scanner console = new Scanner(System.in);

  // get info for first bag
  System.out.print("Weight of first item: ");
  double weightOne = console.nextDouble();
  System.out.print("Length of first item: ");
  double lengthOne = console.nextDouble();
  System.out.print("Width of first item: ");
  double widthOne = console.nextDouble();
  System.out.print("Height of first item: ");
  double heightOne = console.nextDouble();

  // get info for second bag
  System.out.print("Weight of second item: ");
  double weightTwo = console.nextDouble();
  System.out.print("Length of second item: ");
  double lengthTwo = console.nextDouble();
  System.out.print("Width of second item: ");
  double widthTwo = console.nextDouble();
  System.out.print("Height of second item: ");
  double heightTwo = console.nextDouble();

  // potential overages
  // note that these values may be negative,
  // if an excess is not positive,
  // there should be no extra charge.


  double excessWeight = weightOne + weightTwo - WEIGHT_ALLOWANCE;

  double excessSizeOne = lengthOne + widthOne + heightOne - SIZE_ALLOWANCE;

  double excessSizeTwo = lengthTwo + widthTwo + heightTwo - SIZE_ALLOWANCE;

  double extra_cost = 0;

  if (excessWeight > 0) {
   System.out.println("Your luggage is overweight by " + excessWeight + " pounds.");
   extra_cost += (2 * excessWeight);

  } else {
   System.out.println("Your luggage is not overweight.");
  }
  if (excessSizeOne > 0) {
   System.out.printf("Your first piece of luggage is oversize by " + excessSizeOne + " inches.\n");
   extra_cost += 5;

  } else {
   System.out.println("Your first piece of luggage is not oversize.");
  }
  
  if (excessSizeTwo > 0) {
   System.out.println("Your second piece of luggage is oversize by " + excessSizeTwo + " inches.");
   extra_cost += 5;
  
  } else {
   System.out.println("Your second piece of luggage is not oversize.");
  }

  System.out.printf("Total luggage charge is %.2f.\n", extra_cost);

 }
}