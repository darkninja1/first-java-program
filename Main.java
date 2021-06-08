import java.util.Scanner;  
import java.io.FileWriter;
import java.io.IOException;
 





class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}
public class WriteToFile {  
  public static void main(String[] args) {  
    try {  
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write(userName);
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  }  
} 