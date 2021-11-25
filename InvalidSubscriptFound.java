import java.util.Scanner ;
public class InvalidSubscriptFound {

    //main method
   public static void main(String[] args) {
       Scanner animalNumber = new Scanner(System.in);
       //array of animals
       String animals[] = {"Zebra", "Lion", "Elephant", "Monkey", "Shark", "Eagle", "Seahawk", "Raven", "Dog", "Cat"};
       try {
           int number ;
           System.out.print("Enter a number 1-10:");

           number = animalNumber.nextInt();
           //makes the number correspond to the animal in order
           System.out.println(animals[number]);
       }
       //catching 
       catch(Exception e) {
           System.out.println(e);
       }

   }

}