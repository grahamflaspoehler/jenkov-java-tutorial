package jenkovjavaapp;

import java.util.Arrays;


public class MyJavaApp {
  public static void main(String[] args) {

    String[] strings = {"John", "Jennifer", "Graham", "Jeff", "Joe"};

    int wordsStartingWithJ = 0;
    System.out.println("Before loop: " + wordsStartingWithJ);
    for (int i=0; i < strings.length; i++) {
      if (! strings[i].toLowerCase().startsWith("j")){
        continue;
      }

      wordsStartingWithJ++;
    }
    System.out.println("After loop: " + wordsStartingWithJ);





  }
}