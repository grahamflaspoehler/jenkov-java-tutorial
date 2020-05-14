package jenkovjavaapp;

import java.util.Arrays;


public class MyJavaApp {
  public static void main(String[] args) {

    methodOne("1234");

  }

  public static void methodOne(String input) {
    if ( isValid(input) ) {
      System.out.println(input + " is valid");
    } else {
      System.out.println(input + " isn't valid");
    }
  }

  public static boolean isValid(String value) {
    if ( value.equals("123") ) {
      return true;
    }
    return false;
  }
}