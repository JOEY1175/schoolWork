import java.util.Scanner;

public class Depatments {

   public static void main(String[] args) {
		
		//Departments and their corresponding supervisor
       boolean found=false;
       String arr[][]={{"Software Engineering","Johnston"},{"IT","Lee"},{"Network Systems & Data Communications","Dr. Bendallah"},{"Criminal Justice","Douglas"},{"Nursing","Kolehmainen"}};
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a Department Name");
       System.out.flush();
       String department = scanner.nextLine();
       for(int i=0;i<5;i++){
           if(arr[i][0].equals(department)){
               System.out.println("Supervisor for the department is: "+ arr[i][1]);
               found=true;
               break;
           }
       }
	    //Error code for incorrect input
       if(!found){
           System.out.println("Department details not found for the entered department");

       }
   }

}
