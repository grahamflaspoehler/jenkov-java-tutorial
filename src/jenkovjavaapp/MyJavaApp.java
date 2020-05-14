package jenkovjavaapp;

import java.util.Arrays;

// + Switch statements allow you to choose between multiple code blocks depending on the value of a variable
// + Provide the switch statement a value to switch on
  // + each case statement compares the value of the switch with a constant, if equal, the block after the colon is
// executed
// the `break` keyword breaks you out of the switch statement, otherwise code would continue to execute down the rest
// of the case statements
// the default case is executed if none of the cases are met. 


public class MyJavaApp {
  public static void main(String[] args) {
    int amount = 10;

    switch(amount) {
      case 0 :
        System.out.println("amount is 0"); break;
      case 5 :
        System.out.println("amount is 5"); break;
      case 10 :
        System.out.println("amount is 10"); break;
      default :
        System.out.println("amount is something else");
    }
  }
}