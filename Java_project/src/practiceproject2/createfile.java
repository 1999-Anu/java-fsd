package practiceproject2;

import java.io.File;
import java.io.IOException;  
public class createfile {
  public static void main(String[] args) {
    try {
      File obj = new File("new1.txt");
      if (obj.createNewFile()) {
        System.out.println("File created: " + obj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}