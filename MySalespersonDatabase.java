import java.util.*;
public class MySalespersonDatabase {
   public static void main(String[] args) {
       // object of salesperson class
       Salesperson salespersons[]=new Salesperson[15];
       //Scanner object for read
       Scanner sc=new Scanner(System.in);
       //count of sales person
       int cnt=0;
       //Loop until quit
       while(true) {
           //User option prompt
           System.out.println("User Options:-");
           System.out.println("R. To add a record to the database \nD. Delete a record from the database\nC. Change a record in the database"
                   + "\nQ. Quit\n");
           System.out.print("Enter your choice: ");
           String c=sc.nextLine();
           //error check
           while(!c.equals("R") && !c.equals("r") && !c.equals("D") && !c.equals("d") && !c.equals("C") && !c.equals("c") && !c.equals("Q") && !c.equals("q")) {
               System.out.println("ERROR!!!Wrong choice!!!");
               System.out.print("Enter your choice: ");
               c=sc.nextLine();
           }
           //Select actions according to user choice
           if(c.equals("R")) {
               cnt=addOption(salespersons,cnt);
               display(salespersons,cnt);
           }
           else if(c.equals("r")) {
               cnt=addOption(salespersons,cnt);
               display(salespersons,cnt);
           }
           else if(c.equals("D")) {
               cnt=deleteOption(salespersons,cnt);
               display(salespersons,cnt);
           }
           else if(c.equals("d")) {
               cnt=deleteOption(salespersons,cnt);
               display(salespersons,cnt);
           }
           else if(c.equals("C")) {
               changeOption(salespersons,cnt);
               display(salespersons,cnt);
           }
           else if(c.equals("c")) {
               changeOption(salespersons,cnt);
               display(salespersons,cnt);
           }
           else {
               System.out.println("Terminating application!!!!");
               break;
           }
           System.out.println();
       }
       }
   //Method to add a sales person details in DB
   public static int addOption(Salesperson[] array, int count) {
       //Scanner object for read
       Scanner sc=new Scanner(System.in);
       boolean flag=false;
       int id;
       if(count==array.length) {
           System.out.println("Sorry - array is full -- cannot add a record");
       }
       else {
           System.out.print("Enter sales person id: ");
           id=sc.nextInt();
           for(int i=0;i<count;i++) {
               if(array[i].getId()==id) {
                   System.out.println("Sorry - ID number #"+id+" exist in the database");
                   flag=true;
                   break;
               }
           }
           if(flag==false) {
               System.out.print("Enter sales: ");
               double sales=sc.nextDouble();
               array[count]=new Salesperson(id,sales);
               count++;
           }
       }
       System.out.println();
       return count;
       }
   //Method to delete a sales person details from database
   public static int deleteOption(Salesperson[] array, int count) {
       //Scanner object for read
               Scanner sc=new Scanner(System.in);
               boolean flag=false;
               int id;
               if(count==0) {
                   System.out.println("Cannot delete - no records in database");
               }
               else {
                   System.out.print("Enter sales person id: ");
                   id=sc.nextInt();
                   for(int i=0;i<count;i++) {
                       if(array[i].getId()==id) {
                           for(int j=i;j<count-1;j++) {
                               array[j]=array[j+1];
                           }
                           flag=true;
                           count--;
                           break;
                       }
                   }
                   if(flag==false) {
                       System.out.println("Sorry - ID number #"+id+" does not exist in the database");
                   }
               }
               System.out.println();
               return count;
       }
   //Method to update a sales person sales amount from DB
   public static void changeOption(Salesperson[] array, int count) {
       //Scanner object for read
       Scanner sc=new Scanner(System.in);
       boolean flag=false;
       int id;
       if(count==0) {
           System.out.println("Database is empty -- cannot change record");
       }
       else {
           System.out.print("Enter sales person id: ");
           id=sc.nextInt();
           for(int i=0;i<count;i++) {
               if(array[i].getId()==id) {
                   System.out.print("Enter new sales: ");
                   double sales=sc.nextDouble();
                   array[i].setSales(sales);
                   flag=true;
                   count--;
                   break;
               }
           }
           if(flag==false) {
               System.out.println("Sorry - ID number #"+id+" does not exist in the database");
           }
       }
       System.out.println();
       }
   //Display database
   public static void display(Salesperson[] array, int count) {
       System.out.println("Sales person's details: ");
           for(int i=0;i<count;i++) {
               System.out.println("ID: "+array[i].getId()+", SalesAmount: $"+array[i].getSales());
           }
       }
}