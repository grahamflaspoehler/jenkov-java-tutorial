package jenkovjavaapp;

import java.util.ArrayList;
import java.util.List;

public class MyJavaApp {

  public static void main(String[] args) {

    List<String> list = new ArrayList<>();

    String element1 = "el 1";
    String element2 = "el 2";
    String element3 = "el 3";

    list.add(element1);
    list.add(element2);

    boolean containsElement1 = list.contains(element1);
    System.out.println("List contains element1: " + containsElement1);
  }

}