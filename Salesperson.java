public class Salesperson {
   //Instance variables
   private int id;
   private double sales;
   //Constructor
   public Salesperson(int idNum, double amt) {
       id=idNum;
       sales=amt;
   } 
   //getters
   
   public int getId() {
       return id;
   } public double getSales() {
       return sales;
   }
   //Setters
   public void setId(int idNum) {
       id=idNum;
   }
   public void setSales(double amt) {
       sales=amt;
   }
}
