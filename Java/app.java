import java.util.Scanner;

public class app 
{
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
   
      System.out.println("Hello user"); 
      System.out.println("My name is Java");
      System.out.println("Enter your name:  ");
      String name = scanner.nextLine();
      System.out.println("Hello " + name );
      System.out.print("Can you please kindly give me your age : ");
      int age = scanner.nextInt();
      if (age >= 18) {
      System.out.println("Yes, you're an resposible adult then! ");
      System.out.println("This also means you are eligible for voting!");
      } else if (age >= 13 ) {
        System.out.println("You're teen! ");
        System.out.println("You are not eligible for voting! Skibidi");
      } else {
        System.out.println("You're a kid that means!");
        System.out.println("Nah, you gotta be kidding me, you are not even in Highschool");
      }

      
    

     scanner.close();

      
   }   
}  