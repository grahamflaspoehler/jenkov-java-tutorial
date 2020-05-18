package jenkovjavaapp;

import java.util.Collection;
import java.util.HashSet;

public class MyJavaApp {
  public static void main(String[] args) {

    String anElement = "an element";
    Collection collection = new HashSet();

    boolean didCollectionChange = collection.add(anElement);
    System.out.println("anElement was added: " + didCollectionChange);


    System.out.println("Calling a method from MyCollectionUtil:");
    MyCollectionUtil.doSomething(collection);
  }

}