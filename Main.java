import java.util.Scanner;  
import java.io.FileWriter;
import java.io.IOException;
 





class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username:");

    String userName = myObj.nextLine(); 

    
    System.out.println("Enter Password:");

    String passWord = myObj.nextLine(); 
    try {  
      FileWriter myWriter = new FileWriter("user.txt");
      myWriter.write(userName+"\n");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
      FileWriter myWriter2 = new FileWriter("pass.txt");
      myWriter2.write(passWord+"\n");
      myWriter2.close();
      System.out.println("Successfully wrote to the file.");
    } 
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  }
}
