package practiceproject2;

import java.io.FileWriter; 
import java.io.IOException; 
public class writefile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("new1.txt");
      myWriter.write("Write the content");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}