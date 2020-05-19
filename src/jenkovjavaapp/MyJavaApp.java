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

    int index1 = list.indexOf(element1);
    int index2 = list.indexOf(element2);
    int index3 = list.indexOf(element3);

    System.out.println("Index 1: " + index1);
    System.out.println("Index 2: " + index2);
    System.out.println("Index 3: " + index3);
  }

}